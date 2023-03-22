package com.softserve.edu03.pt;

import java.util.Scanner;

public class TotalAvgApp {
	public int getTotal(int num1, int num2) {
		return num1+num2;
	}
	
	public String getAverage(int num1, int num2) {
		double avg = (double)(num1 + num2)/2;
		return String.format("%.1f", avg);
	}
	
	static int getNumber(String prompt) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(prompt);
		return scanner.nextInt();
	}
	
	public static void main(String[] args) {
		int num1 = TotalAvgApp.getNumber("Enter the first number: ");
		int num2 = TotalAvgApp.getNumber("Enter the second number: ");
		TotalAvgApp totalAvgApp = new TotalAvgApp();
		int sum = totalAvgApp.getTotal(num1, num2);
		String avg = totalAvgApp.getAverage(num1, num2);
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
		System.out.println("The average of " + num1 + " and " + num2 + " is " + avg);
	}
}
