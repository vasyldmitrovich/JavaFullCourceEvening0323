package com.softserve.edu05.pt;


import java.util.Scanner;

public class Pt2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Write a number==");
        int n= scanner.nextInt();
        System.out.println("Your number is Prime? ");
        System.out.println(isPrime(n));
    }

    //Create method like this is good decision
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    }


