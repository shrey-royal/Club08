package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	private static String URL = "jdbc:mysql://localhost:3306/club08";
	private static String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static String USERNAME = "root";
	private static String PASSWORD = "root";
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVERCLASS);
			
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			if(conn != null) {
				System.out.println("Database Conected!");
			} else {
				System.out.println("Failed to connect to club08.");
			}
		} catch (Exception e) {
			System.out.println("Error Connecting to the database: ");
			e.printStackTrace();
		}
		return conn;
	}
	
//	public static void main(String[] args) {
//		System.out.println(getConnection());
//	}
}
