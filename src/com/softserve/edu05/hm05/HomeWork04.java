package com.softserve.edu05.hm05;

import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        // Loop until the user guesses the number
        while (true) {
            // Prompt the user to guess the number
            Scanner input = new Scanner(System.in);
            System.out.print("Guess the number (between 1 and 100): ");
            int guess = input.nextInt();

            // Check if the guess is correct
            if (guess == number) {
                System.out.println("Congratulations! You guessed the number!");
                break;
            }

            // Check if the guess is too high or too low
            if (guess > number) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
        }
    }
}
