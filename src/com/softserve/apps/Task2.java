package com.softserve.apps;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        print(number);
    }

    public static void print(int number) {

        System.out.print("Prime factorization of " + number + ": ");
        for (int i = 2; i <= number; i++) {
            int count = 0;
            while (number % i == 0) {
                count++;
                number /= i;
            }
            if (count > 0) {
                if (count == 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + "^" + count + " ");
                }
            }
        }
    }
}