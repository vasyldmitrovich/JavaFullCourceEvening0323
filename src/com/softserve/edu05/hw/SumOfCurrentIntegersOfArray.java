package com.softserve.edu05.hw;

import com.softserve.edu05.pt.Utils;

public class SumOfCurrentIntegersOfArray {
	private final Utils utils = new Utils(); //is it right to make it private and final here?
	private final int[] intArray = new int[10];
	
	public int[] getTenIntegerInputArray() {
		for (int i = 0; i < 10; i++) {
			intArray[i] = utils.inputIntReader("Enter any positive or negative integer number");
		}
		return intArray;
	}
	
	public int getSumOfFivePositiveNumbers(int[] arr) {
		int sum = 0;
		if (isFirstFifeNumbersPositive(arr)) {
			sum = getSumOfFirstFiveNumbers(arr);
		}
		if (!isFirstFifeNumbersPositive(arr) && isSecondFifeNumbersPositive(arr)) {
			sum = getSumOfLastFiveNumbers(arr);
		}
		return sum;
	}
	
	public boolean isFirstFifeNumbersPositive(int[] arr) {
		boolean result = true;
		for (int i = 0; i < 5; i++) {
			if (arr[i] < 0) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public boolean isSecondFifeNumbersPositive(int[] arr) {
		boolean result = true;
		for (int i = 5; i < 10; i++) {
			if (arr[i] < 0) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public int getSumOfFirstFiveNumbers(int[] arr) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public int getSumOfLastFiveNumbers(int[] arr) {
		int sum = 0;
		for (int i = 5; i < 10; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
