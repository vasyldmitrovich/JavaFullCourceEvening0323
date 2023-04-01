package com.softserve.edu05.pt;

import java.util.Arrays;

public class ArrayPractice {
	public String[] stringArraySorter(String[] stringArr) {
		Arrays.sort(stringArr);
		return stringArr;
	}
	
	public int getAverageOfIntArrayValues(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum+=num;
		}
		return sum/arr.length;
	}
	
	public boolean isElementPresentInOneOfTwoArrays(String[] stringArr, int[] intArr, String element) {
		for (String str : stringArr) {
			if (str.equals(element)) {
				return true;
			}
		}
		Utils utils = new Utils();
		if (!utils.isStringNumeric(element)) {
			return false;
		}
		for (int num : intArr) {
			if (num == Integer.parseInt(element)) {
				return true;
			}
		}
		return false;
	}
}
