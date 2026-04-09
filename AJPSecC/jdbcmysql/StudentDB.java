package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbc_driver="com.mysql.cj.jdbc.Driver";
		String host="jdbc:mysql://localhost:3306/studentdb2";
		String username="root";
		String password="";
		String create_table="""
				CREATE TABLE IF NOT EXISTS student (
				id INT PRIMARY KEY AUTO_INCREMENT,
				name VARCHAR(50) NOT NULL,
				course VARCHAR(50),
				marks DECIMAL(10,2)
				)
				""";
          try {
			Class.forName(jdbc_driver);
//			System.out.println("Driver ready!");
			Connection con =DriverManager.getConnection(host,username,password);
//			System.out.println("Host ready!");
			Statement smt=con.createStatement(
					ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE
					);
			ResultSet rs=smt.executeQuery("select * from student");
			rs.moveToInsertRow();
			rs.updateString("name", "Student6");
			rs.updateString("course","Ph.D");
			rs.updateLong("marks",70);
			rs.insertRow();
			System.out.println("ID\tName\t\tCourse\t\tMarks");
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String course=rs.getString("course");
				long marks=rs.getLong("marks");
				System.out.println(
						String.format("%d\t%s\t%s\t\t%d", id,name,course,marks)
						);
			}
//		while(rs.next()) {
//			    long marks=rs.getLong("marks");
//			    if(marks<=75) {
//			    	 rs.updateLong("marks", marks+5);
//			    	 rs.updateRow();
//			    }
//				int id=rs.getInt("id");
//				String name=rs.getString("name");
//				String course=rs.getString("course");
//				marks=rs.getLong("marks");
//				System.out.println(
//						String.format("%d\t%s\t%s\t\t%d", id,name,course,marks)
//						);
//			}
//			int rowAffected=smt.executeUpdate("""
//					insert into student(name,course,marks) values 
//					('Student3','B.Tech(CS)',80), ('Student4','B.Pharma',70)
//					""");
//			if(rowAffected>0) {
//				System.out.println("Record inserted!");
//			} else {
//				System.out.println("Record is not inserted!");
//			}
//			smt.execute(create_table);
//			System.out.println("Student table ready!");
		  } catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		  }
	}

}
