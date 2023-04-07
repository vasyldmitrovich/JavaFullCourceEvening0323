package com.softserve.edu06.hw.hw1;

public class Eagle extends FlyingBird {
	
	public Eagle(String feathers, String layEggs) {
		super(feathers, layEggs);
	}
	
	@Override
	public String toString() {
		return "Eagle " + getFeathers() + ", and " + getLayEggs();
	}
}
