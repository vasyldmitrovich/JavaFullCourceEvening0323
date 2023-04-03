package com.softserve.edu03.hw;

public class Demo {
	public static void main(String[] args) {
		//hw1
		System.out.println("hw1: Triangle area");
		TriangleAreaCalc triangleAreaCalc = new TriangleAreaCalc();
		int side1 = triangleAreaCalc.inputNumberReader("Input side 1: ");
		int side2 = triangleAreaCalc.inputNumberReader("Input side 2: ");
		int side3 = triangleAreaCalc.inputNumberReader("Input side 3: ");
		System.out.println("The area of the triangle is: " + triangleAreaCalc.triangleArea(side1, side2, side3));
		//hw2
		System.out.println("hw2: Smallest number");
		SmallestNumber smallestNumber = new SmallestNumber();
		int num1 = smallestNumber.intReader("Input first number: ");
		int num2 = smallestNumber.intReader("Input second number: ");
		int num3 = smallestNumber.intReader("Input third number: ");
		System.out.println("The smallest number is " + smallestNumber.smallestNumFinder(num1, num2, num3));
		//hw3
		System.out.println("hw3: Enter person data");
		Person person1 = new Person();
		person1.getPersonDataFromConsole();
		System.out.println(person1.output());
		System.out.println(person1.getFirstName() + " " + person1.getLastName() + " age is " + person1.getAge());
		person1.changeName("Anna", "Shum");
		System.out.println(person1.getFirstName() + " " + person1.getLastName() + " age isn't change: " + person1.getAge());
		System.out.println("Creating 5 Persons from console:");
		Person person2 = new Person();
		person2.getPersonDataFromConsole();
		System.out.println(person2.output());
		Person person3 = new Person();
		person3.getPersonDataFromConsole();
		System.out.println(person3.output());
		Person person4 = new Person();
		person4.getPersonDataFromConsole();
		System.out.println(person4.output());
		Person person5 = new Person();
		person5.getPersonDataFromConsole();
		System.out.println(person5.output());
	}
}
