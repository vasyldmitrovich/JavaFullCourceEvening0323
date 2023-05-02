package com.softserve.edu11.hm11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork3 {
    public static void main(String[] args) {//Good
        Scanner scanner = new Scanner(System.in);

        // Input text from console
        System.out.println("Enter text containing US currency format: ");
        String text = scanner.nextLine();

        // Define the US currency pattern
        String usCurrencyPattern = "\\$\\d+(\\.\\d{2})?";

        // Create a Pattern object with the US currency pattern
        Pattern pattern = Pattern.compile(usCurrencyPattern);

        // Create a Matcher object with the input text and the pattern
        Matcher matcher = pattern.matcher(text);

        // Find and display all occurrences of US currency format
        System.out.println("Occurrences of US currency format:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}
