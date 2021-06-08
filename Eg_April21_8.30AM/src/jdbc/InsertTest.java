package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  
		Student stu = new Student();
		stu.setId(5);
		stu.setName("Student5");
		stu.setAddr("Addr5");
		
		
		
		
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver class Loaded");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eg_april_21", "root", "root");
		if (con != null)
			System.out.println("Connected to MySQL DB");
		else
			System.out.println("Not COnnected...");

		
		
		
		
		Statement st = con.createStatement();
		String qry = "insert into Student values("+stu.getId()+",'"+ stu.getName()+"','"+stu.getAddr()+"')";
		//String qry = "delete from Student where id = 1 ";
		System.out.println(qry);
		int i = st.executeUpdate(qry);
		if(i != 0 )
			System.out.println("Record Deleted....");
		else
			System.out.println("Deletion Failed...");
	}

}
