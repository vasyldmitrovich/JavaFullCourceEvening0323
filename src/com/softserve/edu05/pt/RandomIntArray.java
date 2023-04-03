package com.softserve.edu05.pt;

import java.util.Random;

public class RandomIntArray {
	private final int[] arr = new int[10];
	
	public int[] getTenRandomIntArray() {
		Random random = new Random(); //Sonar suggests to change to SecureRandom.getInstanceStrong()
		for (int i = 0; i < 10; i++) {
			int r = (random.nextInt(100)-50);
			arr[i] = r;
		}
		return arr;
	}
	
	public int getMaxValue(int[] intArray) {
		int max = 0;
		for (int num : intArray) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
	
	public int getSumOfPositiveNumbers(int[] intArray) {
		int sum = 0;
		for (int num : intArray) {
			if (num >= 0) {
				sum += num;
			}
		}
		return sum;
	}
	
	public int countNegativeNumbers(int[] intArray) {
		int count = 0;
		for (int num : intArray) {
			if (num < 0) {
				count++;
			}
		}
		return count;
	}
	
	public int countPositiveNumbers(int[] intArray) {
		int count = 0;
		for (int num : intArray) {
			if (num >= 0) {
				count++;
			}
		}
		return count;
	}
	
	public String negativePositiveValuesBalance(int[] intArray) {
		int countNegative = countNegativeNumbers(intArray);
		int countPositive = countPositiveNumbers(intArray);
		if (countNegative > countPositive) {
			return "There are more negative values in the array.";
		}
		if (countNegative < countPositive) {
			return "There are more positive values in the array.";
		}
		return "There are equal number of positive and negative values in the array.";
	}
}
