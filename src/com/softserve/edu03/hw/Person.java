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
	
	public void getPersonDataFromConsole() {
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
		System.out.println("Changing name and last name of " + this.firstName + " " + this.lastName);
		this.firstName = fn;
		this.lastName = ln;
		System.out.println("Now name and last name are: " + firstName + " " + lastName);
	}
}
