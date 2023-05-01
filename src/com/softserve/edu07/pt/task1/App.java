package com.softserve.edu07.pt.task1;

public class App {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		//Create animal in one line, in next line
		Animal[] animals = new Animal[]{cat1, cat2, dog1, dog2};
		System.out.println("We have four animals, lets hear them out:");
		for (Animal a : animals) {
			a.feed();
			a.voice();
		}
	}
}
