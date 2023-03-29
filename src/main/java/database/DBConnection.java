package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection dbConn() {
		Connection conn = null;
		try {
			// 1. Load the driver
			// this Driver class knows how to communicate with the DB
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			// 2. location or IP address and port number
			// MAC
			conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/voda2023", "root", "root");
			System.out.println("DB conected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
