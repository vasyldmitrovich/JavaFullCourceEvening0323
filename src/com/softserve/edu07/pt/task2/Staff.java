package com.softserve.edu07.pt.task2;

public abstract class Staff extends Person {
	
	abstract int salary();
	
	@Override
	void print() {
		System.out.println("I am a staff person.");
	}
}
