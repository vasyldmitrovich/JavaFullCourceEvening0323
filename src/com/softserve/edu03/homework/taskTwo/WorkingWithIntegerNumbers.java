package com.softserve.edu03.homework.taskTwo;

import java.util.Arrays;
import java.util.Scanner;

public class WorkingWithIntegerNumbers {
    private Scanner scanner = new Scanner(System.in);

    public void workingWithNumbers() {
        System.out.println("Input first integer number");
        int numberOne = scanner.nextInt();
        System.out.println("Input second integer number");
        int numberTwo = scanner.nextInt();
        System.out.println("Input third integer number");
        int numberThree = scanner.nextInt();
        foundMaxAndMinValueFromNumbers(numberOne, numberTwo, numberThree);
    }

    private void foundMaxAndMinValueFromNumbers(int... numbers) {
        System.out.println("Max value = " + Arrays.stream(numbers).max().getAsInt());
        System.out.println("Min value = " + Arrays.stream(numbers).min().getAsInt());
    }
}
