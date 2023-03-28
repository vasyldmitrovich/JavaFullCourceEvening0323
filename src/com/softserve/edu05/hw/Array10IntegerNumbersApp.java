package com.softserve.edu05.hw;

import java.util.Scanner;

public class Array10IntegerNumbersApp {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(String.format("Enter %s number, please:", i+1));
            numbers[i] = scanner.nextInt();
        }

        if (isPositive(numbers)) {
            System.out.println("Sum of the first five elements is: " + sumOfFirstFiveNumbers(numbers));
        } else {
            System.out.println("Product of the last five elements is: " + productOfLastFiveNumbers(numbers));
        }

    }

    public static boolean isPositive(Integer[] numbers){
        boolean isPositive = true;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] < 0) {
                isPositive = false;
                break;
            }
        }
        return isPositive;
    }

    public static Integer sumOfFirstFiveNumbers(Integer[] numbers) {
        Integer sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static Integer productOfLastFiveNumbers(Integer[] numbers) {
        Integer prod = 1;
        for (int i = 5; i < 10; i++) {
            if (numbers[i] < 0) {
                continue;
            }
            prod = prod * numbers[i];
        }
        return prod;
    }
}
