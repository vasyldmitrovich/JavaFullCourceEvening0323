package com.softserve.edu05.pt;

public class PrimeNumber {
	private PrimeNumber() {
	}
	
	public static String outputMessageAfterCheck(boolean b) {
		if (b) {
			return "Is a prime number.";
		}
		return "Is not a prime number.";
	}
	
	public static String isPrimeNumber(int num) {
		if (num == 0 || num == 1) {
			return outputMessageAfterCheck(false);
		}
		if (num == 2) {
			return outputMessageAfterCheck(true);
		}
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				return outputMessageAfterCheck(false);
			}
		}
		return outputMessageAfterCheck(true);
	}
}
