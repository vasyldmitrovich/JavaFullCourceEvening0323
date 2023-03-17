package com.softserve.edu01.homework.class1;

import java.util.Scanner;

public class SimpleCalculator {
	int num1;
	int num2;
	Scanner scanner = new Scanner(System.in);
	
	public void inputNumbers() {
		System.out.println("Enter first number:");
		num1 = scanner.nextInt();
		System.out.println("Enter second number:");
		num2 = scanner.nextInt();
	}
	
	public void chooseOperation() {
		System.out.println("Choose operation: \n" +
				"Enter + for addition \n" +
				"Enter - for subtraction \n" +
				"Enter * for multiplication \n" +
				"Enter / for division \n");
	}
	
	public void getResult() {
		char operation = scanner.next().charAt(0);
		switch (operation) {
			case '+':
				addition();
				break;
			case '-':
				subtraction();
				break;
			case '*':
				multiplication();
				break;
			case '/':
				division();
				break;
		}
	}
	
	public void addition() {
		System.out.println(num1+num2);
	}
	
	public void subtraction() {
		System.out.println(num1-num2);
	}
	
	public void multiplication() {
		System.out.println(num1*num2);
	}
	
	public void division() {
		System.out.println(num1/num2);
	}
	
	public static void main(String[] args) {
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		simpleCalculator.inputNumbers();
		simpleCalculator.chooseOperation();
		simpleCalculator.getResult();
	}
}