package com.softserve.edu06.hw.hw1;

public class Penguin extends NonFlyingBird {
	
	public Penguin(String feathers, String layEggs) {
		super(feathers, layEggs);
	}
	
	@Override
	public String toString() {
		return "Penguin " + getFeathers() + ", and " + getLayEggs();
	}
}
