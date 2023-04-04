package com.softserve.edu07.hw.hw2;

public class Liner extends WaterVehicle {
	private int floors;
	private int passengers;
	
	public Liner() {
	}
	
	public Liner(int floors, int passengers) {
		this.floors = floors;
		this.passengers = passengers;
	}
	
	public int getFloors() {
		return floors;
	}
	
	public void setFloors(int floors) {
		this.floors = floors;
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
	void isSailing() {
		System.out.println("Liner is sailing!");
	}
	
	@Override
	public String toString() {
		return "Liner with " + floors + " floors have " + passengers + " passengers.";
	}
}
