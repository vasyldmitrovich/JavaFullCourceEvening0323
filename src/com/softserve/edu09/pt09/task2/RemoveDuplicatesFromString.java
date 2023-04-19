package com.softserve.edu09.pt09.task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        // Take input from the console
        System.out.println("Enter a set of numbers separated by commas: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // Split the input string by commas
        String[] numbers = input.split(",");

        // Create a Set to store unique numbers
        Set<String> uniqueNumbers = new HashSet<>();

        // Loop through the numbers array and add each number to the Set
        for (String number : numbers) {
            uniqueNumbers.add(number.trim());
        }

        // Convert the Set back to a string
        StringBuilder result = new StringBuilder();
        for (String number : uniqueNumbers) {
            result.append(number).append(", ");
        }

        // Remove the trailing comma and space
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        // Output the result to the console
        System.out.println("Unique numbers: " + result.toString());
    }
}
