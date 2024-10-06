package com.ui;

import java.util.Scanner;

import com.service.CarService;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
				addNewCar(sc);
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
	
	public static void addNewCar(Scanner sc) {
		CarService carService = new CarService();
		
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

}
