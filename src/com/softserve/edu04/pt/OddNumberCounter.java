package com.softserve.edu04.pt;

public class OddNumberCounter {
	public int oddNumCount(int... num) {
		int count = 0;
		for (int number : num) {
			if (number%2==0) {
				count++;
			}
		}
		return count;
	}
}
