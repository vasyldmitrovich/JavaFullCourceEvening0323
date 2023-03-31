package com.softserve.edu01.pt;

import java.util.Scanner;

public class AppP_1_2{
    public static void main(String[] args) {
        average();
    }

    public static void average() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number -->  ");
        double a = sc.nextDouble();
        System.out.println("Enter second number -->  ");
        double b = sc.nextDouble();
        System.out.println("Enter third number -->  ");
        double c = sc.nextDouble();
        double x = (a + b + c) / 3;
        System.out.println("Average of this numbers is -->  " + x);
    }
}
