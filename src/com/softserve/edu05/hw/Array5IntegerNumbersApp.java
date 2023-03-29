package com.softserve.edu05.hw;

import java.util.Scanner;

public class Array5IntegerNumbersApp {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(String.format("Enter %s number, please:", i + 1));
            numbers[i] = scanner.nextInt();
        }

        // Find position of second positive number
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

        // Find minimum value and its position in the array
        int position = 0;
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                position = i;
            }
        }
        System.out.println(String.format("Minimum value is: %s", min));
        System.out.println(String.format("Position of minimum value is %s", position + 1));

        // Calculate the product of all entered even numbers (exclude 0 from even if entered by user)
        Integer evenProd = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && numbers[i] % 2 == 0) {
                System.out.println(numbers[i].toString());
                evenProd = evenProd * numbers[i];
            }
        }

        if (evenProd == 1) {
            System.out.println("There are no even and positive numbers in array");
        } else {
            System.out.println(String.format("Product of all entered numbers is %s", evenProd));
        }
    }
}
