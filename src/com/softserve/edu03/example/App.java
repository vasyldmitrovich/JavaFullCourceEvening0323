package com.softserve.edu03.example;

public class App {
	public static double avgRating(Student... students) {
		double rating = 0;
		for (Student student : students) {
			rating +=student.getRating();
		}
		return rating/students.length;
	}
	
	public static boolean betterStudent(Student student1, Student student2) {
		int rating1 = student1.getRating();
		int rating2 = student2.getRating();
		return rating1 > rating2;
	}
	
	public static void main(String[] args) {
		Student student1 = new Student("Nata", 5);
		Student student2 = new Student("Olga", 4);
		Student student3 = new Student("Stan", 5);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		double avgRating = App.avgRating(student1, student2, student3);
		String formattedAvg = String.format("%.2f", avgRating);
		System.out.println("Average rating of all students is: " + formattedAvg);
		System.out.println("Student " + student2.getName() + " is better then " + student1.getName() + "?");
		System.out.println("Answer is: " + App.betterStudent(student2, student3));
		System.out.println("Student " + student1.getName() + " is better then " + student2.getName() + "?");
		System.out.println("Answer is: " + App.betterStudent(student1, student2));
	}
}
