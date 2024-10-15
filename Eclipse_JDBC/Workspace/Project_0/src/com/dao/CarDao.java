package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Car;
import com.util.DBConn;

public class CarDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private Statement stmt = null;
	
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
	
	public List<Car> getAllCars() {
//		Car car = null;
		List<Car> cars = null;
		String query = "SELECT * FROM luxurycars";
		
		try {
			conn = DBConn.getConnection();
			stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
			cars = new ArrayList<Car>();
			
			while(rs.next()) {
//				car = new Car(rs.getInt("id"), rs.getString("make"), rs.getString("model"), rs.getInt("year"), rs.getDouble("price"), rs.getString("color"));
				cars.add(
						new Car(
							rs.getInt("id"),
							rs.getString("make"),
							rs.getString("model"),
							rs.getInt("year"),
							rs.getDouble("price"),
							rs.getString("color")
							)
						);
			}
		} catch (Exception e) {
			System.out.println("Error adding car: ");
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				System.out.println("Error closing connections: ");
				e.printStackTrace();
			}
		}
		return cars;
	}

	public void deleteCarById(int id) {
		String query = "DELETE FROM luxurycars WHERE id = ?";
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			int ra = pstmt.executeUpdate();
			
			if(ra == 1) {
				System.out.println("Car deleted successfully!");
			} else {
				System.out.println("Failed to delete car.");
			}
		} catch (Exception e) {
			System.out.println("Error deleting car: ");
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

	public Car getCarById(int id) {
		Car car = null;
		String query = "SELECT * FROM luxurycars WHERE id = ?";
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				car = new Car(
						id,
						rs.getString("make"),
						rs.getString("model"),
						rs.getInt("year"),
						rs.getDouble("price"),
						rs.getString("color")
						);
			} else {
				System.out.println("No car found of id: " + id);
			}
		} catch (Exception e) {
			System.out.println("Error getting car: ");
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
		return car;
	}
	
	public void updateCar(Car car) {
		String query = "UPDATE luxurycars SET make = ?, model = ?, year = ?, price = ?, color = ? WHERE id = ?";
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, car.getMake());
			pstmt.setString(2, car.getModel());
			pstmt.setInt(3, car.getYear());
			pstmt.setDouble(4, car.getPrice());
			pstmt.setString(5, car.getColor());
			pstmt.setInt(6, car.getId());

			int ra = pstmt.executeUpdate();
			if (ra == 1) {
				System.out.println("Car data updated successfully!");
			} else {
				System.out.println("Failed to update car data!");
			}
		} catch (Exception e) {
			System.out.println("Error updating car: ");
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