package com.softserve.edu06.pt.pt2;

public class Truck extends Car {
	//is it enough? It works as asked, but I'm not sure
	public Truck(String model, int maxSpeed, int yearOfProduction) {
		super(model, maxSpeed, yearOfProduction);
	}
	
	@Override
	public String toString() {
		return "Truck model " + getModel() + ", max speed " + getMaxSpeed() + ", year of production - " + getYearOfProduction();
	}
}
