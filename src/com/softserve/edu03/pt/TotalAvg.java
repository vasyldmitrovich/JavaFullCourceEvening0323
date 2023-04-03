package com.softserve.edu03.pt;

import java.util.Scanner;

public class TotalAvg {
	
	private TotalAvg() {
	}
	
	public static int getTotal(int num1, int num2) {
		return num1+num2;
	}
	
	public static String getAverage(int num1, int num2) {
		double avg = (double)(num1 + num2)/2;
		return String.format("%.1f", avg);
	}
	
	static int getNumber(String prompt) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(prompt);
		return scanner.nextInt();
	}
}
