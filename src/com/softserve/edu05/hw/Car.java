package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Comparator;

public class Car {
	private String type;
	private int yearOfProduction;
	private double engineCapacity;
	
	public Car() {
	}
	
	public Car(String type, int yearOfProduction, double engineCapacity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	
	public double getEngineCapacity() {
		return engineCapacity;
	}
	
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	@Override
	public String toString() {
		return "Car type " + type + ", " + "year of production - " + yearOfProduction +
				 ", engine capacity - " + engineCapacity;
	}
	
	public String getTypeByCurrentYear(int year, Car... cars) {
		for (Car car : cars) {
			if (car.getYearOfProduction() == year) {
				return car.getType();
			}
		}
		return "There is no car";
	}
	
	public Car[] getSortedByYearOfProduction(Car[] cars) {
		Arrays.sort(cars, new Comparator<>() {
			@Override
			public int compare(Car c1, Car c2) {
				return Integer.compare(c2.yearOfProduction, c1.yearOfProduction);
			}
		});
		return cars;
	}
}
