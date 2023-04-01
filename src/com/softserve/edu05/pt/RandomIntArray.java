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
	
	public int getMaxValue() {
		int max = 0;
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
	
	public int getSumOfPositiveNumbers() {
		int sum = 0;
		for (int num : arr) {
			if (num >= 0) {
				sum += num;
			}
		}
		return sum;
	}
	
	public int countNegativeNumbers() {
		int count = 0;
		for (int num : arr) {
			if (num < 0) {
				count++;
			}
		}
		return count;
	}
	
	public int countPositiveNumbers() {
		int count = 0;
		for (int num : arr) {
			if (num >= 0) {
				count++;
			}
		}
		return count;
	}
	
	public void negativePositiveValuesBalance() {
		int countNegative = countNegativeNumbers();
		int countPositive = countPositiveNumbers();
		if (countNegative > countPositive) {
			System.out.println("There are more negative values in the array.");
		}
		if (countNegative < countPositive) {
			System.out.println("There are more positive values in the array.");
		}
		if (countNegative == countPositive) {
			System.out.println("There are equal number of positive and negative values in the array.");
		}
	}
}
