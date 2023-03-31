package com.softserve.edu04.hw;

public class NumberRangeCheck {
	private NumberRangeCheck() {
	}
	
	public static boolean areNumbersInRange(float num1, float num2, float num3) {
		float min = -5f;
		float max = 5f;
		return num1 <= max && num1 >= min && num2 <= max && num2 >= min && num3 <= max && num3 >= min;
	}
}
