package com.softserve.edu03.hw;

public class PersonApp {
	
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.input();
		System.out.println(person1.output());
		System.out.println(person1.getFirstName() + " " + person1.getLastName() + " age is " + person1.getAge());
		person1.changeName("Anna", "Shum");
		System.out.println(person1.getFirstName() + " " + person1.getLastName() + " age isn't change: " + person1.getAge());
		
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
