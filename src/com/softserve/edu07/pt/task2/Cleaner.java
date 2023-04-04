package com.softserve.edu07.pt.task2;

public class Cleaner extends Staff {
	private static final String TYPE_PERSON = "Cleaner";
	
	public Cleaner() {
		System.out.println(TYPE_PERSON);
	}
	
	@Override
	int salary() {
		return 1000;
	}
	
	@Override
	void print() {
		System.out.println("I am a cleaner.");
	}
}
