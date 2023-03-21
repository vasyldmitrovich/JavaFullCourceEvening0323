package com.softserve.edu03.pt03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = getNumber("Enter the first number: ");
        int num2 = getNumber("Enter the second number: ");

        int sum = num1 + num2;
        double avg = (double) sum / 2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("The average of " + num1 + " and " + num2 + " is " + avg);
    }

    public static int getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
