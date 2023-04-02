package com.softserve.edu04.hw4;

import com.softserve.edu03.hw3.Triangle;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner nScan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float n1 = nScan.nextFloat();
        System.out.print("Enter second number: ");
        float n2 = nScan.nextFloat();
        System.out.print("Enter third number: ");
        float n3 = nScan.nextFloat();
        boolean inRange = (n1 >= -5 && n1 <= 5) && (n2 >= -5 && n2 <= 5) && (n3 >= -5 && n3 <= 5);
        if (inRange) {
            System.out.println("All numbers in range [-5, 5]");
        } else {
            System.out.println("Not all numbers in range [-5, 5]...");
        }
    }
}
