package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver class Loaded");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eg_april_21", "root", "root");
		if (con != null)
			System.out.println("Connected to MySQL DB");
		else
			System.out.println("Not COnnected...");

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("Select * from Student");
		while (rs.next()) {
			// create List collection 
			
			Student stu = new Student();
			stu.setId(rs.getInt(1));
			stu.setName(rs.getString(2));
			stu.setAddr(rs.getString(3));
			
			System.out.println(stu);
			
			// add stu obj to List
			
			//System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + " \t" + rs.getString(3));
		
		}
		con.close();

	}

}
