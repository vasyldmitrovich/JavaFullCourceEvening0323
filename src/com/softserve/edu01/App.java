package com.softserve.edu01;

import java.util.Scanner;

public class App {
	public int intInput(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextInt();
	}
	
	public void tasksDemo() {
		System.out.println("If Vasyl want to know the result of task1 press 1");
		System.out.println("If Vasyl want to know the result of task3 press 3");
		System.out.println("If Vasyl want to know the result of task5 press 5");
		System.out.println("If Vasyl want to know the result of task6 press 6");
		System.out.println("If Vasyl want to know the result of task7 press 7");
		System.out.println("If Vasyl want to know the result of task8 press 8");
		System.out.println("If Vasyl want to know the result of task9 press 9");
		System.out.println("If Vasyl want to know the result of task10 press 10");
		System.out.println("If Vasyl want to know the result of task12 press 12");
		System.out.println("If Vasyl want to know the result of task13 press 13");
	}
	public static void main(String[] args) {
		App app = new App();
		app.tasksDemo();
		int taskNum = app.intInput("Enter your number: ");
		switch (taskNum) {
			case 1:
				System.out.println(Task1.generateFibonacci(66));
			break;
			case 3:
				System.out.println(Task3.dollarConvert(40.8, 20.6));
			break;
			case 6:
				System.out.println(Task6.countWords("Text"));
			break;
			case 7: Task7.calculateFactorial();
			break;
			case 8:
				System.out.println(NumberOperation.returnNumberEnglish(8));
			break;
			case 9:
				System.out.println(Task9.countOnes(8));
			break;
			case 12:
				System.out.println(Task12.sumOfAllTheMultiples());
			break;
			case 13:
				System.out.println(Task13.smallestPositiveNumber());
			break;
		}
	}
}
