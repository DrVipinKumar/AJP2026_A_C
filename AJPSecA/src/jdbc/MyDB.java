package jdbc;
import java.sql.*;
public class MyDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String db_url="jdbc:mysql://localhost:3306/empdb";
          String db_driver="com.mysql.cj.jdbc.Driver";
          String username="root";
          String password="";
          String sqlInsert = "INSERT INTO employees (name, age, salary, department) VALUES ('DrVipin', 46, 500000,'MCA')";
          String createTableSQL = """
                  CREATE TABLE IF NOT EXISTS employees (
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      name VARCHAR(100) NOT NULL,
                      age INT,
                      salary DECIMAL(10,2),
                      department VARCHAR(50)
                  )
              """;
          try {
			Class.forName(db_driver);
			try {
				Connection conn= DriverManager.getConnection(db_url,username,password);
				System.out.println("Connected to MySQL");
				Statement smt=conn.createStatement();
				smt.execute(createTableSQL);
				System.out.println("Table Created!");
				int rowAffected=smt.executeUpdate(sqlInsert);
				if (rowAffected>0) {
					System.out.println("Record Inserted!");
					ResultSet rs =smt.executeQuery("select * from employees");
					while(rs.next()) {
						System.out.println("Name="+rs.getString("name"));
					}
				} else {
					System.out.println("Not Inserted!");
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
