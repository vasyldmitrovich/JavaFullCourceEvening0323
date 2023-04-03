package com.softserve.edu05.hw;

import com.softserve.edu05.pt.Utils;

import java.util.Random;

public class GuessNumber {
	private static final int RANDOM = new Random().nextInt(10);
	private final Utils utils = new Utils();
	
	public void checkInputNumber() {
		int number = 0;
		while (number != RANDOM) {
			number = utils.inputIntReader("Enter number from 0 to 10");
			if (number > RANDOM) {
				System.out.println("Too high, try again.");
			}
			if (number < RANDOM) {
				System.out.println("Too low, try again.");
			}
		}
		System.out.println("Woo-hoo! You've guessed the number!");
	}
}
