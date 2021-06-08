package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	private static Connection con = null;
	
		public static Connection getConnection() {
			
			try {
				if(con == null) {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class Loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eg_april_21", "root", "root");
			System.out.println("Connected with DB...");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return con;
		}
}
