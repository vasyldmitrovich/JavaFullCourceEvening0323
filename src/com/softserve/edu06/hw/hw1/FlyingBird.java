package com.softserve.edu06.hw.hw1;

public class FlyingBird extends Bird {
	
	public FlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}
	
	@Override
	public void fly() {
		System.out.println("I can fly!");
	}
}
