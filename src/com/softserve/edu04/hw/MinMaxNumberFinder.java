package com.softserve.edu04.hw;

public class MinMaxNumberFinder {
	//can't understand why do Sonar recommend to add private constructor in this case
	private MinMaxNumberFinder() {
	}
	
	public static int getMinNumber(int... numbers) {
		int min = Integer.MAX_VALUE;
		for (int num : numbers) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}
	
	public static int getMaxNumber(int... numbers) {
		int max = Integer.MIN_VALUE;
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
}
