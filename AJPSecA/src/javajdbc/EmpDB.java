package javajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String driver_name="com.mysql.cj.jdbc.Driver";
        String host="jdbc:mysql://localhost:3306/employeedb";
        String username="root";
        String pwd="";
        String create_table="""
        		 CREATE TABLE IF NOT EXISTS employee (
        		 id INT PRIMARY KEY AUTO_INCREMENT,
        		 name VARCHAR(50) NOT NULL,
        		 dept VARCHAR(50),
        		 salary DECIMAL(10,2)
        		 )
        		""";
        try {
			Class.forName(driver_name);
//			System.out.println("Driver is ready!");
			Connection con= DriverManager.getConnection(host,username,pwd);
//			System.out.println("Host is ready!");
			Statement smt=con.createStatement(
					ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			smt.execute(create_table);
//			System.out.println("Table is ready!");
			ResultSet rs=smt.executeQuery("select * from employee");
			System.out.println("ID\tName\tDepartment\tSalary");
//			while(rs.next()) {
//				rs.moveToInsertRow();
//				rs.updateString("name","Emp6");
//				rs.updateString("dept", "MCA");
//				rs.updateDouble("Salary", 800000);
//				rs.insertRow();
//				break;
//			}
			while(rs.next()) {
//				long salary=rs.getLong("salary");
//				if(salary<=50000)
//				{
//					rs.updateDouble("Salary",salary*1.1);
//					rs.updateRow();
//				}
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String dept=rs.getString("dept");
				long salary=rs.getLong("salary");
				System.out.println(String.format(" %d\t%s\t%s\t\t%s"
						,id,name,dept,salary));
				}
			
//			int rowAffected=smt.executeUpdate("""
//					insert into employee
//					(name,dept,salary) values('Emp4','Sales',20000),
//					('Emp5','Sales',30000)
//					""");
//			if(rowAffected>0) {
//				System.out.println("Record inserted!");
//				
//			} else {
//				System.out.println("Record is not inserted!");
//			}
			rs.close();smt.close();con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
