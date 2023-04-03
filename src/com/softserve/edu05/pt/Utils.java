package com.softserve.edu05.pt;

import java.util.Scanner;

public class Utils {
	//instead of using Arrays.toString() method I created this one and next one
	// to get rid of the braces [] and for practice
	public String getStringOfStringArray(String[] arr) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				stringBuilder.append(arr[i]);
				stringBuilder.append(", ");
			} else {
				stringBuilder.append(arr[i]);
			}
		}
		stringBuilder.append(".");
		return stringBuilder.toString();
	}
	
	public String getStringOfIntArray(int[] arr) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				stringBuilder.append(arr[i]);
				stringBuilder.append(", ");
			} else {
				stringBuilder.append(arr[i]);
			}
		}
		stringBuilder.append(".");
		return stringBuilder.toString();
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
