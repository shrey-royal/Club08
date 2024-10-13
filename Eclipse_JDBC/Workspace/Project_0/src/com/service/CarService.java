package com.service;

import java.util.List;

import com.dao.CarDao;
import com.model.Car;

public class CarService {
	private Car car = null;
	private CarDao carDao = null;
	
	public void addCar(String make, String model, int year, double price, String color) {
		car = new Car(make, model, year, price, color);
		carDao = new CarDao();
		
		carDao.addCar(car);
	}
	
	public List<Car> getAllCars() {
		carDao = new CarDao();
		
		return carDao.getAllCars();
	}
	
	public void deleteCarById(int car_id) {
		carDao.deleteCarById(car_id);
	}
}
