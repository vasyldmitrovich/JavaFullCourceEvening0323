package com.softserve.edu01.practice.class1;

import java.util.Scanner;

public class PracticalTasks {
	Scanner scanner = new Scanner(System.in);
	
	public void testInputOutput() {
		System.out.println("Hello. What is your name?");
		String name = scanner.nextLine();
		System.out.println("How old are you?");
		int age = Integer.parseInt(scanner.nextLine());
		System.out.println("Hello " + name);
		System.out.println("You are " + age);
	}
	
	public void threeStringsReversWriter() {
		System.out.println("Input text:");
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		String str3 = scanner.nextLine();
		System.out.println(str3);
		System.out.println(str2);
		System.out.println(str1);
	}
	
	public void threeNumAvg() {
		System.out.println("Input first number:");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Input second number:");
		int num2 = scanner.nextInt();
		System.out.println("Input third number:");
		int num3 = scanner.nextInt();
		double sum = num1 + num2 + num3;
		double avgNum123 = sum/3;
		//double avgNum123 = (num1 + num2 + num3)/3; ---> gives 5.0 instead of 5,66666
		System.out.println(avgNum123);
	}
	
	public void howAreYou() {
		System.out.println("How are you?");
		String answer = scanner.nextLine();
		System.out.println("You are " + answer);
	}
	
	public static void main(String[] args) {
		PracticalTasks practicalTasks = new PracticalTasks();
		practicalTasks.testInputOutput();
		practicalTasks.threeStringsReversWriter();
		practicalTasks.threeNumAvg();
		practicalTasks.howAreYou();
	}
}
