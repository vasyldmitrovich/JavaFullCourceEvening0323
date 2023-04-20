package com.softserve.edu11.pt11;

import java.util.Scanner;

public class PracticalTask1 {
    public static void main(String[] args) {
        // Input two String variables
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
        scanner.close();

        // Verify if firstString is a substring of secondString
        boolean isSubstring = isSubstring(firstString, secondString);

        // Print the result
        System.out.println("Is \"" + firstString + "\" a substring of \"" + secondString + "\"? " + isSubstring);
    }


    public static boolean isSubstring(String firstString, String secondString) {
        // Convert both strings to lowercase for case-insensitive comparison
        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();

        // Check if firstString is a substring of secondString
        return secondString.contains(firstString);
    }
}
