package com.softserve.edu01.pt01;

import java.util.Scanner;

public class PracticalTask02 {
    public static void main(String[] args) {
        // create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number:");
        int num1 = scanner.nextInt();

        System.out.println("Input second number:");
        int num2 = scanner.nextInt();

        System.out.println("Input third number:");
        int num3 = scanner.nextInt();
        scanner.close();

        float average = (float) (num1 + num2 + num3)/3;
        System.out.println("Average is: " + average);
    }

}
