package com.softserve.edu06.pt.pt2;

public abstract class Car {
	private String model;
	private int maxSpeed;
	private int yearOfProduction;
	
	protected Car() {
	}
	
	protected Car(String model, int maxSpeed, int yearOfProduction) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.yearOfProduction = yearOfProduction;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	//Method run and stop must be like here void run(){} and in subclass you must realize this methods
	public void run(){}
	
	public void stop(){}
}
