package com.softserve.edu07.hw.hw2;

public class Helicopter extends FlyingVehicle {
	private int maxHeight;
	private int weight;
	private int passengers;
	
	public Helicopter() {
	}
	
	public Helicopter(int maxHeight, int weight, int passengers) {
		this.maxHeight = maxHeight;
		this.weight = weight;
		this.passengers = passengers;
	}
	
	public int getMaxHeight() {
		return maxHeight;
	}
	
	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
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
		System.out.println("Helicopter is flying!");
	}
	
	@Override
	void lend() {
		System.out.println("Helicopter has landed!");
	}
	
	@Override
	public String toString() {
		return "Helicopter wit weight " + weight + " can fly at maximum height" + maxHeight +
				", have " + passengers + " passengers.";
	}
}
