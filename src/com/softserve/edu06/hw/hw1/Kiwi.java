package com.softserve.edu06.hw.hw1;

public class Kiwi extends NonFlyingBird {
	
	public Kiwi(String feathers, String layEggs) {
		super(feathers, layEggs);
	}
	
	@Override
	public String toString() {
		return "Kiwi " + getFeathers() + ", and " + getLayEggs();
	}
}
