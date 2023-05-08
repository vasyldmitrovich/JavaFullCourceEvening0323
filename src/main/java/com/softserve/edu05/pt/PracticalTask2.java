package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class PracticalTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        int num = scan.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime.");
        } else {
            System.out.println(num + " is not a prime.");
        }
    }
}
