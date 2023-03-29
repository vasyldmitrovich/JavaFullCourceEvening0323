package com.softserve.edu05.hw;

import java.util.Scanner;

public class Array5IntegerNumbersApp {

    public static void main(String[] args) {
        Integer[] numbers = inputNumbers(5);

        // Find minimum value and its position in the array
        findPositionOfSecondPositiveNumber(numbers);

        // Find minimum value and its position in the array
        findMinimumNumberAndItsPosition(numbers);

        // Calculate the product of all entered even numbers (exclude 0 from even if entered by user)
        calculateAndPrintProductNumbers(numbers);
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

    public static void findPositionOfSecondPositiveNumber(Integer[] numbers) {
        int secondPositive = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                secondPositive = secondPositive + 1;
                if (secondPositive == 2) {
                    System.out.println(String.format("Position of second positive number is %s", i + 1));
                    break;
                }
            }
        }
    }

    public static void findMinimumNumberAndItsPosition(Integer[] numbers) {
        int position = 0;
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                position = i + 1;
            }
        }
        System.out.println("Minimum value is: " + min);
        System.out.println("Position of minimum value is " + position);
    }

    public static void calculateAndPrintProductNumbers(Integer[] numbers) {
        int evenProd = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && numbers[i] % 2 == 0) {
                System.out.println(numbers[i].toString());
                evenProd = evenProd * numbers[i];
            }
        }

        if (evenProd == 1) {
            System.out.println("There are no even and positive numbers in array");
        } else {
            System.out.println("Product of all entered numbers is " + evenProd);
        }
    }

}
