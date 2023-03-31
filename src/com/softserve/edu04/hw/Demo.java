package com.softserve.edu04.hw;

import com.softserve.edu04.pt.Helper;

public class Demo {
	public static void main(String[] args) {
		Helper helper = new Helper();
		//hw1
		float float1 = helper.inputFloatReader("Enter first float number (with or without dot .)");
		float float2 = helper.inputFloatReader("Enter second float number (with or without dot .)");
		float float3 = helper.inputFloatReader("Enter third float number (with or without dot .)");
		System.out.println("Result of check, if all those numbers are in range from -5 to 5 is: " +
		NumberRangeCheck.areNumbersInRange(float1, float2, float3));
		System.out.println(); //added this for better readability when running the whole project
		//hw2
		int int1 = helper.inputIntReader("Enter first number");
		int int2 = helper.inputIntReader("Enter second number");
		int int3 = helper.inputIntReader("Enter third number");
		System.out.println("Minimum number is " + MinMaxNumberFinder.getMinNumber(int1, int2, int3));
		System.out.println("Maximum number is " + MinMaxNumberFinder.getMaxNumber(int1, int2, int3));
		System.out.println();
		//hw3
		int http = helper.inputIntReader("Enter HTTP error number");
		HttpError httpError = HttpError.N400;
		System.out.println("The name of this error is: " + httpError.getErrorName(http));
		System.out.println();
		//hw4
		Faculty faculty = new Faculty();
		Season season = Season.WINTER;
		int studentsQuantity = helper.inputIntReader("Enter number of students at the faculty");
		faculty.setStudentsQuantity(studentsQuantity);
		faculty.setSeason(season.getSeason(helper.inputStringReader("Enter season name")));
		System.out.println(faculty);
		System.out.println();
		//hw5
		Dog dog1 = new Dog("Puff", Breed.POODLE, 10);
		Dog dog2 = new Dog("Barky", Breed.GERMAN_SHEPHERD, 15);
		Dog dog3 = new Dog("Frenchie", Breed.LABRADOR, 6);
		System.out.println("hw5 \nwe have three dogs: " + dog1.getName() + ", " +
				dog2.getName() + " and " + dog3.getName() + ".");
		System.out.println("Lets check if there are no two dogs with the same name.\n" +
				"The answer is: " + helper.noNameRepeat(dog1.getName(), dog2.getName(), dog3.getName()));
		System.out.print("Now lets find the name and the breed of the oldest dog.");
		Dog oldestDog = helper.getOldest(dog1, dog2, dog3);
		System.out.println("Oldest dog's name is: " + oldestDog.getName() +
				", it's breed is: " + Breed.getBreedName(oldestDog));
	}
}
