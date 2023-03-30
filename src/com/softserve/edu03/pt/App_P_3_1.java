package com.softserve.edu03.pt;

import java.util.Scanner;


/*
Write a Java console application with methods that accept two numbers as arguments
        and have the following names:
        • getTotal - returns their sum;
        • getAverage - returns their average;
        • (*) static getNumber(String prompt) - allows input of numbers using Scanner with
        messages and return number
*/


public class App_P_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number --> ");
        int a = sc.nextInt();
        System.out.println("Enter second number --> ");
        int b = sc.nextInt();
        getTotal(a, b);
        getAverage(a, b);
    }

    public static void getTotal(int a, int b) {
        System.out.println("Sum is --> " + (a + b));
    }

    public static void getAverage(int a, int b) {
        System.out.println("Sum is --> " + ((a + b) / 2));
    }
}
