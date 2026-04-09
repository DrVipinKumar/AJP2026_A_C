package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String mysql_driver="com.mysql.cj.jdbc.Driver";
        String host="jdbc:mysql://localhost:3306/empdb";
        String username="root";
        String password="";
        int rowAffected=0;
        String create_table="""
        		    CREATE TABLE IF NOT EXISTS student (
        		    id INT PRIMARY KEY AUTO_INCREMENT,
        		    name VARCHAR(100) NOT NULL,
        		    course VARCHAR(100),
        		    branch VARCHAR(50)
        		    )
        		""";
       try {
			Class.forName(mysql_driver);
			Connection con=DriverManager.getConnection(host,username,password);
			Statement smt=con.createStatement();
			smt.execute(create_table);
			System.out.println("Table ready!");
			rowAffected=smt.executeUpdate("""
		          		insert into student(name,course,branch)
				    	  	values('Dr. Vipin','Ph.D','CS')
		        		""");  
		    	  if(rowAffected>0) {
		    		  System.out.println("Row Inserted!");
		    		  ResultSet rs=smt.executeQuery("select * from student");
		    		  while(rs.next()) {
		    			  System.out.println(String.format("Name=%s Course=%s Branch=%s", 
		    					 rs.getString("name"),
		    					 rs.getString("course"),
		    					 rs.getString("branch")));
		    		  }
		    	  } else {
		    		  System.out.println("Row not inserted!");
		    	  }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
