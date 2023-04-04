package com.softserve.edu07.hw.hw2;

public abstract class Passengers {
	int passengersQuantity; //changed name - A field should not duplicate the name of its containing class (Sonar)
	
	Passengers() {
	}
	
	public int getPassengersQuantity() {
		return passengersQuantity;
	}
	
	public void setPassengersQuantity(int passengersQuantity) {
		this.passengersQuantity = passengersQuantity;
	}
}
