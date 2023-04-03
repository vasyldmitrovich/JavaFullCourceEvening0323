package com.softserve.edu05.pt;

import java.util.Scanner;

public class Pt_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a Prime number!");
        } else {
            System.out.println(num + " isn't a Prime number!");
        }
    }

}
