package com.softserve.edu05.pt05;

import java.util.Scanner;

public class PracticalTask02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }

    public static boolean isPrime (int number) {
        if (number < 2) { return false; }
        if (number == 2) { return true; }
        if (number % 2 == 0) {return false; }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
