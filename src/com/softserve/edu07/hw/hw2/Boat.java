package com.softserve.edu07.hw.hw2;

public class Boat extends WaterVehicle {
	private int volume;
	private int passengers;
	
	public Boat() {
	}
	
	public Boat(int volume, int passengers) {
		this.volume = volume;
		this.passengers = passengers;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
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
		System.out.println("Boat is sailing!");
	}
	
	@Override
	public String toString() {
		return "Boat with volume " + volume + " have " + passengers + " passengers.";
	}
}
