package com.softserve.edu05.hw;

import java.util.Scanner;

public class Array5IntegerNumbersApp {

    public static void main(String[] args) {
        Integer[] numbers = inputNumbers(5);

        // Find position of second positive number
        System.out.println("Position of second positive number is " + getPositionOfSecondPositiveNumber(numbers));

        // Find minimum value and its position in the array
        Integer minNumber = getMinimumNumber(numbers);
        System.out.println("Minimum value is: " + minNumber);
        System.out.println("Position of minimum value is " + getPositionOfNumber(numbers, minNumber));

        // Calculate the product of all entered even numbers (exclude 0 from even if entered by user)
        Integer evenProd = calculateProductOfEvenNumbers(numbers);
        if (evenProd == 1) {
            System.out.println("There are no even positive numbers in array");
        } else {
            System.out.println("Product of all entered numbers is " + evenProd);
        }
    }

    public static Integer[] inputNumbers(int count) {
        Integer[] numbers = new Integer[count];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(String.format("Enter %s number, please:", i + 1));
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static int getPositionOfSecondPositiveNumber(Integer[] numbers) {
        int secondPositive = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                secondPositive = secondPositive + 1;
                if (secondPositive == 2) {
                    index = i + 1;
                    break;
                }
            }
        }
        return index;
    }

    public static Integer getMinimumNumber(Integer[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int getPositionOfNumber(Integer[] numbers, Integer number) {
        int position = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == number) {
                position = i + 1;
                break;
            }
        }
        return position;
    }

    public static int calculateProductOfEvenNumbers(Integer[] numbers) {
        int evenProd = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && numbers[i] % 2 == 0) {
                evenProd = evenProd * numbers[i];
            }
        }
        return evenProd;
    }

}
