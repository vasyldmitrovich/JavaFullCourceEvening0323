package com.softserve.edu07.hw.hw2;

public class Motorcycle extends GroundVehicle {
	private int maxSpeed;
	private int passengers;
	
	public Motorcycle() {
	}
	
	public Motorcycle(int maxSpeed, int passengers) {
		this.maxSpeed = maxSpeed;
		this.passengers = passengers;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
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
		System.out.println("Motorcycle is driving!");
	}
	
	@Override
	public String toString() {
		return "Motorcycle max speed is " + maxSpeed + " it has " + passengers + " passengers.";
	}
}
