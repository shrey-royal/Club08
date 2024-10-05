package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.Car;
import com.util.DBConn;

public class CarDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	public void addCar(Car car) {
		String query = "INSERT INTO luxurycars (make, model, year, price, color) VALUES (?, ?, ?, ?, ?)";
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, car.getMake());
			pstmt.setString(2, car.getModel());
			pstmt.setInt(3, car.getYear());
			pstmt.setDouble(4, car.getPrice());
			pstmt.setString(5, car.getColor());
			
			int ra = pstmt.executeUpdate();
			
			if(ra == 1) {
				System.out.println("Car added successfully!");
			} else {
				System.out.println("Failed to add car.");
			}
		} catch (Exception e) {
			System.out.println("Error adding car: ");
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				System.out.println("Error closing connections: ");
				e.printStackTrace();
			}
		}
	}
}	