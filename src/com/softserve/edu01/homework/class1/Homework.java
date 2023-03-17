package com.softserve.edu01.homework.class1;

import java.util.Scanner;

public class Homework {
	
	public void flowerBed(int radius) {
		double perimeter = 2 * radius * Math.PI;
		double area = radius * radius * Math.PI;
		System.out.printf("Rounded perimeter of flower bed is: %.2f %n", perimeter);
		System.out.println("Area of flower bed is: " + area);
	}
	
	public void nameAddress() {
		//task requires declaring variables first and then to ask for input
		String name;
		String address;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		name = scanner.nextLine();
		System.out.println("Where do you live, " + name + "?");
		address = scanner.nextLine();
		System.out.println(name + ", you live in " + address);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Homework homework = new Homework();
		System.out.println("Input radius of flower bed: ");
		int radius = scanner.nextInt();
		homework.flowerBed(radius);
		homework.nameAddress();
	}
}
