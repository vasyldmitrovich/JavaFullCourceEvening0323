package com.softserve.edu04.hw;

import java.util.Scanner;

public class MinAndMaxValues {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[3];
        numbers[0] = getNumber("Input first number: ");
        numbers[1] = getNumber("Input second number: ");
        numbers[2] = getNumber("Input third number: ");

        System.out.println("Minimum value is: " + getMin(numbers).toString());
        System.out.println("Maximum value is: " + getMax(numbers).toString());
    }

    public static Integer getMin(Integer[] numbers) {
        Integer min = numbers[0];
        for (int i = 1; i < 3; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static Integer getMax(Integer[] numbers) {
        Integer max = numbers[0];
        for (int i = 1; i < 3; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static Integer getNumber(String input) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(input);
        return Integer.parseInt(scanner.nextLine());
    }

}
