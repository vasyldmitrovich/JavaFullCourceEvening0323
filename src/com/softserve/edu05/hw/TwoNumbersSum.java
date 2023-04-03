package com.softserve.edu05.hw;

import com.softserve.edu05.pt.Utils;

public class TwoNumbersSum {
	private final Utils utils = new Utils();
	
	public int[] getInputTwoNumbers() {
		int[] twoNum = new int[2];
		int count = 0;
		do {
			twoNum[count] = utils.inputIntReader("Enter positive number");
			count++;
		} while (count < 2);
		return twoNum;
	}
	
	public int getSumOfTwoNumbers(int[] num) {
		return num[0]+num[1];
	}
	
	public void programStopOrRerun() {
		TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
		String command = utils.inputStringReader("Enter YES if you want " +
				"to do it again or NO if you want to quit the program.");
		if (command.equalsIgnoreCase("yes")) {
			int[] twoIntArray = twoNumbersSum.getInputTwoNumbers();
			System.out.print("Sum of numbers is: " + twoNumbersSum.getSumOfTwoNumbers(twoIntArray));
		}
		if (command.equalsIgnoreCase("no")) {
			System.out.print("Thank you for using this app :)");
		}
	}
}
