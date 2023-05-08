package com.softserve.edu01;

import java.util.Scanner;

public class Task7 {

    public static void  calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease, enter natural number n: ");
        Integer number = scanner.nextInt();

        if (number > 0) {
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println("Factorial of " + number + " is: " + result);
        } else {
            System.out.println("Error: Wrong number entered!");
        }
    }
}
