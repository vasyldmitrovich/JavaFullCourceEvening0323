package com.softserve.edu07.pt.task2;

public class Student extends Person {
	private static final String TYPE_PERSON = "Student";
	
	public Student() {
		System.out.println(TYPE_PERSON);
	}
	
	@Override
	void print() {
		System.out.println("I am a student.");
	}
}
