package com.softserve.edu11.hw;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = "";
        String lastName = "";

        while (true) {
            System.out.println("Enter your first name: ");
            firstName = scan.nextLine().trim();
            if (isValidName(firstName)) {
                break;
            } else {
                System.out.println("Invalid first name. Please try again!");
            }
        }

        while (true) {
            System.out.println("Enter your last name name: ");
            lastName = scan.nextLine().trim();
            if (isValidName(lastName)) {
                break;
            } else {
                System.out.println("Invalid last name. Please try again!");
            }
        }

        String greet[] = {
                "Hello, ",
                "Welcome, ",
                "Wats up, "
        };

        Random random = new Random();
        String greeting = greet[random.nextInt(greet.length)];
        System.out.println(greeting + "" + firstName + " " + lastName + "!");
    }

    private static boolean isValidName(String name) {
        return Pattern.matches("[A-Za-z\\-\\s]+", name);
    }
}
