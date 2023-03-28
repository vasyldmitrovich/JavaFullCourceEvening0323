package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortApp {

    public static void main(String[] args) {

        // Create a string array and sort it
        String[] strings = {"string", "practical", "task", "homework", "array"};

        System.out.println("Initial array: " + Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println("Sorted array: " + Arrays.toString(strings));

        // Create an array with 5 elements and calculate the average value
        int[] numbers = {1, 4, 6, 7, 3, 9};
        System.out.println("\nInitial array: " + Arrays.toString(numbers));
        System.out.println("Average value is: " + calculateAverage(numbers));

        // Check is the array contains the value entered from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any number value: ");
        Integer value = Integer.parseInt(scanner.nextLine());

        if (!searchValueInArray(numbers, value)) {
            System.out.println("Array does not contain entered value");
        }

    }

    public static float calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum/ numbers.length;
    }

    public static boolean searchValueInArray(int[] numbers, int number) {
        boolean result = false;
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                System.out.print("Array contains number " + numbers[i]);
                result = true;
                break;
            }
        }
        return result;
    }

}
