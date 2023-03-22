package com.softserve.edu02.example;

public class Student {
	private String name;
	private int rating;
	
	public Student() {
	}
	
	public Student(String name, int rating) {
		this.name = name;
		this.rating = rating;
	}
	
	public static double avgRating(Student... students) {
		double rating = 0;
		for (Student student : students) {
			rating +=student.rating;
		}
		return rating/students.length;
	}
	
	public boolean betterStudent(Student student) {
		int rating1 = this.rating;
		int rating2 = student.getRating();
		return rating1 > rating2;
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
	
	public static void main(String[] args) {
		Student student1 = new Student("Nata", 5);
		Student student2 = new Student("Olga", 4);
		Student student3 = new Student("Stan", 5);
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		double avgRating = Student.avgRating(student1, student2, student3);
		String formattedAvg = String.format("%.2f", avgRating);
		System.out.println("Average rating of all students is: " + formattedAvg);
		System.out.println("Student " + student2.getName() + " is better then " + student1.getName() + "?");
		System.out.println("Answer is: " + student2.betterStudent(student1));
		System.out.println("Student " + student1.getName() + " is better then " + student2.getName() + "?");
		System.out.println("Answer is: " + student1.betterStudent(student2));
	}
}

