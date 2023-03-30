package com.softserve.edu04.homework.taskOne;

import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;

public class WorkingWithInputFromUser {
    private Scanner scanner = new Scanner(System.in);
    private final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int[] numbersForTwoTask = new int[10];
    private int[] numbersForThreeTask = new int[5];

    public void setNumbersForTwoTask(int[] numbersForTwoTask) {
        this.numbersForTwoTask = numbersForTwoTask;
    }

    public void setNumbersForThreeTask(int[] numbersForThreeTask) {
        this.numbersForThreeTask = numbersForThreeTask;
    }

    public void foundDaysInMonth() {
        System.out.print("Input number month: ");
        int numberFromUserForMoth = scanner.nextInt();
        System.out.println(Month.of(numberFromUserForMoth).toString() + " he have days = " + daysInMonth[(numberFromUserForMoth - 1)]);
    }

    public void processWorkingWithNumbers() {
        for (int i = 0; i < numbersForTwoTask.length; i++) {
            System.out.print("Input " + i + " number: ");
            numbersForTwoTask[i] = scanner.nextInt();
        }
        if (checkArrayOnPositiveOrNegativeNumber() == true) {
            System.out.println("Sum first five numbers = " + Arrays.stream(Arrays.copyOfRange(numbersForTwoTask, 0, 5)).sum());
        } else {
            System.out.println("Multi last five numbers = " + Arrays.stream(Arrays.copyOfRange(numbersForTwoTask, 5, 10)).reduce((n1, n2) -> n1 * n2).getAsInt());
        }
    }

    private boolean checkArrayOnPositiveOrNegativeNumber() {
        return Arrays.stream(Arrays.copyOfRange(numbersForTwoTask, 0, 5)).filter(number -> number > 0).count() == 5 ? true : false;
    }

    public void workingWithFiveElementInt() {
        for (int i = 0; i < numbersForThreeTask.length; i++) {
            System.out.print("Input " + i + " number: ");
            numbersForThreeTask[i] = scanner.nextInt();
        }
        int indexTwoPositiveNumber = foundIndexTwoPositiveNumberInArray();
        if (indexTwoPositiveNumber != 0) {
            System.out.println("Index two positive number = " + indexTwoPositiveNumber);
        } else {
            System.out.println("Two positive number not found!");
        }
        System.out.println("Multi all even numbers = " + multiAllEvenNumbers());
        int minElement = foundMinValueElementInArray();
        System.out.println("Min element in array = " + minElement);
        System.out.println("Index in array min elem = " + foundIndexInArrayForMinValue(minElement));
    }

    private int multiAllEvenNumbers() {
         return Arrays.stream(numbersForThreeTask)
                .filter(number -> number != 0)
                .filter(number -> number % 2 == 0)
                .reduce((n1, n2) -> n1 * n2).getAsInt();
    }

    public int foundMinValueElementInArray() {
        return Arrays.stream(numbersForThreeTask).min().getAsInt();
    }

    public int foundIndexInArrayForMinValue(int minValue) {
        int indexForMinValue = 0;
        for (int i = 0; i < numbersForThreeTask.length; i++) {
            if (numbersForThreeTask[i] == minValue) {
                indexForMinValue = i;
            }
        }
        return indexForMinValue;
    }

    public int foundIndexTwoPositiveNumberInArray() {
        int countPositiveNumber = 0;
        int indexTwoPositiveNumber = 0;
        for (int i = 0; i < numbersForThreeTask.length; i++) {
            if (numbersForThreeTask[i] > 0) {
                countPositiveNumber += 1;
            }
            if (countPositiveNumber == 2) {
                indexTwoPositiveNumber = i;
            }
        }
        return indexTwoPositiveNumber;
    }
}
