package com.softserve.edu05.hw;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        String answer;
        int sum;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter first number: ");
            int num1 = scan.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scan.nextInt();
            sum = num1 + num2;
            System.out.println("The sum of two numbers is " + sum);
            System.out.print("Do you want to repeat? (y/n) ");
            answer = scan.next();
        } while (answer.equalsIgnoreCase("y"));
        scan.close();
    }
}
