package com.service;

import java.util.List;

import com.dao.CarDao;
import com.model.Car;

public class CarService {
	private Car car = null;
	
	public void addCar(String make, String model, int year, double price, String color) {
		car = new Car(make, model, year, price, color);
		new CarDao().addCar(car);
	}
	
	public List<Car> getAllCars() {
		return new CarDao().getAllCars();
	}
	
	public Car getCarById(int id) {
		return new CarDao().getCarById(id);
	}
	
	public void updateCar(Car updatedCarData) {
		new CarDao().updateCar(updatedCarData);
	}
	
	public void deleteCarById(int car_id) {
		new CarDao().deleteCarById(car_id);
	}
}
