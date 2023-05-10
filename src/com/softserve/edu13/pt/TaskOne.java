package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class TaskOne {
	public static final LocalDate TODAY = LocalDate.now();
	
	private static void getCurrentDayOfWeekName() {
		DayOfWeek dayOfWeek = TODAY.getDayOfWeek();
		System.out.println("Today is " + dayOfWeek);
	}
	
	private static void getFirstMondayOfCurrentMonth() {
		LocalDate dayOfMonth = TODAY.with(firstInMonth(DayOfWeek.MONDAY));
		System.out.println("First Monday of current month is " + dayOfMonth);
	}
	
	private static void sortStringList(List<String> stringList) {
		stringList.sort(String::compareTo);
		System.out.println("Sorted list of String " + stringList);
	}
	
	private static int count(int[] ints, Condition condition) {
		int count = 0;
		for (int i : ints) {
			if (condition.test(i)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		TaskOne.getCurrentDayOfWeekName();
		TaskOne.getFirstMondayOfCurrentMonth();
		List<String> stringList = new ArrayList<>();
		stringList.add("Five");
		stringList.add("One");
		stringList.add("Tree");
		stringList.add("Get");
		System.out.println("List of String " + stringList);
		TaskOne.sortStringList(stringList);
		int[] intArray = {1, -2, 3, 4, 5, 6, -7, 8, 9, 10};
		System.out.println("Array of integers: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		Condition condition = x -> x > 0;
		System.out.println("\nCount with condition > 0 result is: " + TaskOne.count(intArray, condition));
	}
}
