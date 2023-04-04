package com.softserve.edu07.pt.task2;

public class Teacher extends Staff {
	private static final String TYPE_PERSON = "Teacher";
	
	public Teacher() {
		System.out.println(TYPE_PERSON);
	}
	
	@Override
	void print() {
		System.out.println("I am a teacher.");
	}
	
	@Override
	int salary() {
		return 2000;
	}
}
