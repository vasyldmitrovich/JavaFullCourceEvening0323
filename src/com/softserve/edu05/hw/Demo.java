package com.softserve.edu05.hw;

import com.softserve.edu05.pt.Utils;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		Utils utils = new Utils();
		//hw1.1
		MonthNumberOfDays monthNumberOfDays = new MonthNumberOfDays();
		int month = utils.inputIntReader("1.1 Enter correct number of month");
		System.out.print("Number of days in this month is: " + monthNumberOfDays.getDaysByMonth(month));
		//hw1.2
		SumOfCurrentIntegersOfArray sumOfCurrentIntegersOfArray = new SumOfCurrentIntegersOfArray();
		System.out.print("\n1.2 Now let's create a 10 int Array.\n");
		int[] tenIntArray = sumOfCurrentIntegersOfArray.getTenIntegerInputArray();
		System.out.print("Now we have this array: " + Arrays.toString(tenIntArray));
		int result = sumOfCurrentIntegersOfArray.getSumOfFivePositiveNumbers(tenIntArray);
		System.out.print("\nThe sum of five positive numbers (first or second) is: " + result);
		//hw1.3
		FiveIntegerArrayPractice fiveIntegerArrayPractice = new FiveIntegerArrayPractice();
		System.out.print("\n1.3 This time we need a 5 int Array. \n");
		int[] fiveIntArray = fiveIntegerArrayPractice.getFiveIntegerInputArray();
		System.out.print("We've created an array: " + Arrays.toString(fiveIntArray));
		int secondPositiveNumber = fiveIntegerArrayPractice.getSecondPositiveNumber(fiveIntArray);
		System.out.print("\nIndex of second positive number is: " +
				fiveIntegerArrayPractice.getPositionOfCurrentValue(fiveIntArray, secondPositiveNumber));
		int minValue = fiveIntegerArrayPractice.getMinValue(fiveIntArray);
		System.out.print("\nMinimum value of the array is: " + minValue + ", it's index is: " +
				fiveIntegerArrayPractice.getPositionOfCurrentValue(fiveIntArray, minValue));
		System.out.print("\nProduct of even numbers except zero is: " +
				fiveIntegerArrayPractice.getProductOfAllEvenNumbers(fiveIntArray));
		//hw2
		TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
		System.out.print("\n2. Now lets get sum of two entered numbers. \n");
		int[] twoIntArray = twoNumbersSum.getInputTwoNumbers();
		System.out.print("Sum of numbers is: " + twoNumbersSum.getSumOfTwoNumbers(twoIntArray) + "\n");
		twoNumbersSum.programStopOrRerun();
		//hw3
		Car car1 = new Car("Sport car", 2020, 5.0);
		Car car2 = new Car("Minivan", 1999, 3.5);
		Car car3 = new Car("Pickup", 2005, 4.0);
		Car car4 = new Car("Sedan", 2015, 2.0);
		Car[] allCars = {car1, car2, car3, car4};
		System.out.print("\n3. We have four cars: \n" + car1.toString() + ", \n" + car2.toString() +
				", \n" + car3.toString() + ", \n" + car4.toString() + ".");
		System.out.print("\nLet's find model by year.");
		int year = utils.inputIntReader("\nEnter year of production");
		System.out.print(car1.getTypeByCurrentYear(year, allCars) + " with this year of production.");
		System.out.print("\nSorted cars by year of production:");
		allCars = car1.getSortedByYearOfProduction(allCars);
		for (Car car : allCars) {
			System.out.print("\n" + car.toString());
		}
		//hw4
		System.out.print("\n4. Lets play a game - I have a number between 0 and 10, try to guess it :)\n");
		GuessNumber guessNumber = new GuessNumber();
		guessNumber.checkInputNumber();
	}
}
