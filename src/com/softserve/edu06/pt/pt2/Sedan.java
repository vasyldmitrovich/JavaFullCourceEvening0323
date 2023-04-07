package com.softserve.edu06.pt.pt2;

public class Sedan extends Car {
	public Sedan(String model, int maxSpeed, int yearOfProduction) {
		super(model, maxSpeed, yearOfProduction);
	}
	
	@Override
	public String toString() {
		return "Truck model " + getModel() + ", max speed " + getMaxSpeed() + ", year of production - " + getYearOfProduction();
	}
}
