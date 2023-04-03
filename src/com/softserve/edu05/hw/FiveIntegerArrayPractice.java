package com.softserve.edu05.hw;

import com.softserve.edu05.pt.Utils;

public class FiveIntegerArrayPractice {
	private final Utils utils = new Utils();
	private final int[] intArray = new int[5];
	
	public int[] getFiveIntegerInputArray() {
		for (int i = 0; i < 5; i++) {
			intArray[i] = utils.inputIntReader("Enter any positive or negative number: ");
		}
		return intArray;
	}
	
	
	public int getSecondPositiveNumber(int[] intArray) {
		int value = 0;
		int count = 0;
		for (int num : intArray) {
			if (num >= 0) {
				if (count == 1) {
					value = num;
					break;
				}
				count++;
			}
		}
		return value;
	}
	
	public int getMinValue(int[] intArray) {
		int min = Integer.MAX_VALUE;
		for (int num : intArray) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}
	
	public int getPositionOfCurrentValue(int[] intArray, int value) {
		if ( intArray == null) {
			return -1;
		}
		for (int i = 0; i < intArray.length; i ++) {
			if (intArray[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public int getProductOfAllEvenNumbers(int[] intArray) {
		int result = 1;
		for (int num : intArray) {
			if (num != 0 && num%2 == 0) {
				result *= num;
			}
		}
		return result;
	}
}
