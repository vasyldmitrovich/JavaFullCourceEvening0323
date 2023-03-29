package com.softserve.edu03.hw03.hw2;

import java.util.Scanner;
public class Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first number");
        int first = scanner.nextInt();
        System.out.println("Please, enter second number");
        int second = scanner.nextInt();
        System.out.println("Please, enter third number");
        int third = scanner.nextInt();
        System.out.println("Smallest number is: " + smallestNumber(smallestNumber(first, second), third));
    }

    private static int smallestNumber(int first, int second) {
        if (first <= second) {
            return first;
        } else return second;
    }
}
