package com.softserve.edu01.pt;

import java.util.Scanner;

public class PracticalTask1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = getNumber("Enter the first number: ", scanner);
        int num2 = getNumber("Enter the second number: ", scanner);

        int total = getTotal(num1, num2);
        double average = getAverage(num1, num2);

        System.out.println("The sum of the two numbers is: " + total);
        System.out.println("The average of the two numbers is: " + average);
    }

    public static int getTotal(int num1, int num2) {
        return num1 + num2;
    }

    public static double getAverage(int num1, int num2) {
        return (double) (num1 + num2) / 2;
    }

    public static int getNumber(String prompt, Scanner scanner) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
