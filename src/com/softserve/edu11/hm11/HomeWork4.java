package com.softserve.edu11.hm11;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] greetingPhrases = { "Hello, %s!", "Hi there, %s!", "Greetings, %s!", "Hey, %s!", "Welcome, %s!" };

        // Prompt user for first name
        String firstName = "";
        while (firstName.isEmpty()) {
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine();
            if (!isValidName(firstName)) {
                System.out.println("Invalid input. Please enter English letters, spaces, or hyphens only.");
                firstName = "";
            }
        }

        // Prompt user for last name
        String lastName = "";
        while (lastName.isEmpty()) {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine();
            if (!isValidName(lastName)) {
                System.out.println("Invalid input. Please enter English letters, spaces, or hyphens only.");
                lastName = "";
            }
        }

        // Generate random greeting message
        String greeting = String.format(greetingPhrases[random.nextInt(greetingPhrases.length)], firstName + " " + lastName);
        System.out.printf("Random Greeting: %s%n", greeting);

        scanner.close();
    }

    // Method to validate name input
    public static boolean isValidName(String name) {
        return name.matches("[a-zA-Z\\s-]+");
    }
}
