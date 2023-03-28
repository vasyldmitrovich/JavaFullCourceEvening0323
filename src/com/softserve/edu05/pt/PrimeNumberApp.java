package com.softserve.edu05.pt;

import java.util.Scanner;

public class PrimeNumberApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a positive integer number: ");
        Integer number = input.nextInt();

        if (isPrime(number)) {
            System.out.println("This is prime number");
        } else {
            System.out.println("This is NOT prime number");
        }

    }

    public static boolean isPrime(Integer number) {
        if (number < 2)
            return false;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
