package com.softserve.edu05.pt;

import java.util.Scanner;

public class Utils {
	//instead of using Arrays.toString() method I created this one and next one
	// to get rid of the braces [] and for practice
	public void stringArrayPrint(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.print(arr[i]);
			}
		}
		System.out.print(".");
	}
	
	public void intArrayPrint(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.print(arr[i]);
			}
		}
		System.out.print(".");
	}
	
	public String inputStringReader(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextLine();
	}
	
	public int inputIntReader(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextInt();
	}
	
	public boolean isStringNumeric(String st) {
		try {
			Integer.parseInt(st);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
