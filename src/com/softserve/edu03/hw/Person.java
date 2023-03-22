package com.softserve.edu03.hw;

import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Person() {
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int getAge() {
		return 2023 - birthYear;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name: ");
		this.firstName = scanner.nextLine();
		System.out.println("Enter last name: ");
		this.lastName = scanner.nextLine();
		System.out.println("Enter year of birth: ");
		this.birthYear = scanner.nextInt();
		scanner.nextLine();
	}
	
	public String output(){
		return "Person " + firstName + " " + lastName + " was born in " + birthYear;
	}
	
	public void changeName (String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.input();
		System.out.println(person1.output());
		System.out.println(person1.getFirstName() + " " + person1.getLastName() + " age is " + person1.getAge());
		System.out.println("Changing name to Anna and last name to Shum");
		person1.changeName("Anna", "Shum");
		System.out.println(person1.getFirstName() + " " + person1.getLastName() + " age is " + person1.getAge());
		
		Person person2 = new Person();
		person2.input();
		System.out.println(person2.output());
		Person person3 = new Person();
		person3.input();
		System.out.println(person3.output());
		Person person4 = new Person();
		person4.input();
		System.out.println(person4.output());
		Person person5 = new Person();
		person5.input();
		System.out.println(person5.output());
	}
}
