package com.softserve.edu05.pt05.pt2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input positive number");
        int number = sc.nextInt();
        System.out.println("You're number is prime: " + ifPrime(number));
    }

    public static boolean ifPrime(int number) {
        return number % 2 != 0;
    }

}
