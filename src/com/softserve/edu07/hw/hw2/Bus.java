package com.softserve.edu07.hw.hw2;

public class Bus extends GroundVehicle {
	private String route;
	private int passengers;
	
	public Bus() {
	}
	
	public Bus(String route, int passengers) {
		this.route = route;
		this.passengers = passengers;
	}
	
	public String getRoute() {
		return route;
	}
	
	public void setRoute(String route) {
		this.route = route;
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
		System.out.println("Bus is driving!");
	}
	
	@Override
	public String toString() {
		return "Bus route is " + route + ", it has " + passengers + " passengers.";
	}
}
