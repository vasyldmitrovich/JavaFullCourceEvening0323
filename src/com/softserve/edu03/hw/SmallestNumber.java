package com.softserve.edu03.hw;

import java.util.Scanner;

public class SmallestNumber {
	public int smallestNumFinder(int... num) {
		int smallest = num[0];
		for (int i : num) {
			if (i < smallest) {
				smallest = i;
			}
		}
		return smallest;
	}

	/*It is good decision move scanner to method and call this method*/
	public int intReader(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextInt();
	}
}
