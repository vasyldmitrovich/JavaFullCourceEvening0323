package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SmallestNumber smallest = new SmallestNumber();
        Scanner numScan = new Scanner(System.in);
        System.out.print("Enter first number ");
        int num1 = numScan.nextInt();
        System.out.print("Enter second number ");
        int num2 = numScan.nextInt();
        System.out.print("Enter third number ");
        int num3 = numScan.nextInt();
        System.out.println("The smallest number is " + smallest.smallestNumber(num1, num2, num3) + ".");
    }
}
