package com.softserve.edu03.example;

public class Student {
	private String name;
	private int rating;
	
	public Student() {
	}
	
	public Student(String name, int rating) {
		this.name = name;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Student[name=" + name +
				", rating=" + rating + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
}

