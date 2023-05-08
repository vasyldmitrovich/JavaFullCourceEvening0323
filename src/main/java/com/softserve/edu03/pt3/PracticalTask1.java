package com.softserve.edu03.pt3;

import java.util.Scanner;

public class PracticalTask1 {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Please enter second number: ");
        int b = scanner.nextInt();
        int total = num.getTotal(a, b);
        System.out.println("The sum of the " + a + " and " + b + " is " + total);
        double average = num.getAverage(a, b);
        System.out.println("The average of the " + a + " and " + b + " is " + average);
    }
}
