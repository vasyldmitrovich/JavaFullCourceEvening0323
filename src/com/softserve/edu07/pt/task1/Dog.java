package com.softserve.edu07.pt.task1;

public class Dog implements Animal {
	
	@Override
	public void voice() {
		System.out.println("Bark!");
	}
	
	@Override
	public void feed() {
		System.out.println("Fed me with meat!");
	}
}
