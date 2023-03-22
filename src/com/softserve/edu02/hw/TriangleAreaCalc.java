package com.softserve.edu02.hw;

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
	
	public static void main(String[] args) {
		TriangleAreaCalc triangleAreaCalc = new TriangleAreaCalc();
		int side1 = triangleAreaCalc.inputNumberReader("Input side 1: ");
		int side2 = triangleAreaCalc.inputNumberReader("Input side 2: ");
		int side3 = triangleAreaCalc.inputNumberReader("Input side 3: ");
		System.out.println("The area of the triangle is: " + triangleAreaCalc.triangleArea(side1, side2, side3));
	}
}
