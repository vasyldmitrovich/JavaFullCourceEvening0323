package com.softserve.edu05.hw;

public class MonthNumberOfDays {
	private final int[] daysInEachMonth = {31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	MonthNumberOfDays() {
	}
	
	public int getDaysByMonth(int month) {
		return daysInEachMonth[month-1];
	}
}
