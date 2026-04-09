package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentPre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbc_driver="com.mysql.cj.jdbc.Driver";
		String host="jdbc:mysql://localhost:3306/studentdb2";
		String username="root";
		String password="";
		String query="select * from student where course=?";
		
		try {
			Class.forName(jdbc_driver);
			Connection con =DriverManager.getConnection(host,username,password);
		    PreparedStatement pst=con.prepareStatement(query);
		    pst.setString(1, "MCA");
		    ResultSet rs= pst.executeQuery();
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
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
	}

}
