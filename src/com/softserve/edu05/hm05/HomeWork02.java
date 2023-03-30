package com.softserve.edu05.hm05;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        char choice;

        do {
            // Prompt the user to enter two numbers
            System.out.print("Enter the first number: ");
            num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            num2 = input.nextInt();

            // Calculate their sum
            sum = num1 + num2;

            // Display the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

            // Ask the user if they want to perform the operation again
            System.out.print("Do you want to perform the operation again? (y/n): ");
            choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Goodbye!");
    }
}
