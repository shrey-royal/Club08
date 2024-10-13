package com.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.model.Car;
import com.service.CarService;

public class Main {
	private static CarService carService = new CarService();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice = 0;
		
		do {
			System.out.println("--------------------------------");
			System.out.println("    Welcome to Car Dealership   ");
			System.out.println("--------------------------------");
			
			System.out.println("1. Add new car details");
			System.out.println("2. Get all cars details");
			System.out.println("3. Modify car details");
			System.out.println("4. Delete car details");
			System.out.println("5. Exit");
			System.out.print("\nChoose your option: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				addNewCar();
				break;
				
			case 2:
				getCars();
				break;
				
			case 4:
				deleteCar();
				break;
				
			case 5:
				System.out.println("Exiting program...");
				break;

			default:
				System.out.println("Invalid Choice! Please enter a number between 1 to 5.");
				break;
			}
		} while (choice != 5);
	}
	
	public static void addNewCar() {
		sc.nextLine();
		System.out.println("Enter make: ");
		String make = sc.nextLine();
		System.out.println("Enter model: ");
		String model = sc.nextLine();
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		System.out.println("Enter price: ");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter color: ");
		String color = sc.nextLine();
		
		carService.addCar(make, model, year, price, color);
	}
	
	public static void getCars() {
		ArrayList<Car> allCars = (ArrayList<Car>) carService.getAllCars();
		
		System.out.println("(id, make, model, year, price, color)");
		for (Car car : allCars) {
			System.out.println("("+car.getId()+", "+car.getMake()+", "+car.getModel()+", "+car.getYear()+", "+String.format("%.0f", car.getPrice())+", "+car.getColor()+")");
		}
	}
	
	public static void deleteCar() {
		System.out.print("Enter the id to delete the car: ");
		int car_id = sc.nextInt();
		
		carService.deleteCarById(car_id);
	}
}
