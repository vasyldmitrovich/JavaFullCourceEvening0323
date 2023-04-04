package com.softserve.edu07.hw.hw2;

public class Car extends GroundVehicle {
	private String model;
	private int passengers;
	
	public Car() {
	}
	
	public Car(String model, int passengers) {
		this.model = model;
		this.passengers = passengers;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public int getPassengersQuantity() {
		return passengers;
	}
	
	@Override
	public void setPassengersQuantity(int passengers) {
		this.passengers = passengers;
	}
	
	@Override
	void drive() {
		System.out.println("Car is driving!");
	}
	
	@Override
	public String toString() {
		return "Car model is " + model + " it has " + passengers + " passengers.";
	}
}
