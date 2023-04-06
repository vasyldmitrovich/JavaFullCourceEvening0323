package com.softserve.edu05.pt;

import java.util.Scanner;

public class AppP_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number --> ");
        int number = sc.nextInt();
        isPrimeNumber(number);
    }

    public static void isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                System.out.println("Your number is NOT prime");
                break;
            } else if ((number % i) != 0) {
                System.out.println("Your number is prime");
                break;
            }
        }
    }
}
