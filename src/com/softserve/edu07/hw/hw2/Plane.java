package com.softserve.edu07.hw.hw2;

public class Plane extends FlyingVehicle {
	private int maxDistance;
	private int passengers;
	
	public Plane() {
	}
	
	public Plane(int maxDistance, int passengers) {
		this.maxDistance = maxDistance;
		this.passengers = passengers;
	}
	
	public int getMaxDistance() {
		return maxDistance;
	}
	
	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
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
	void fly() {
		System.out.println("Plane if flying!");
	}
	
	@Override
	void lend() {
		System.out.println("Plane has landed!");
	}
	
	@Override
	public String toString() {
		return "Plane with max distance " + maxDistance + " have " + passengers + " passengers.";
	}
}
