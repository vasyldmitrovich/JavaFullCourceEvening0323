package com.softserve.edu03.hw;

import java.util.Scanner;

public class TriangleAreaCalc {
	
	public double triangleArea(int a, int b, int c) {
		double s = (double) (a+b+c)/2;
		double res1 = s*(s-a)*(s-b)*(s-c);
		return Math.sqrt(res1);
	}
	
	public int inputNumberReader(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextInt();
	}
}
