package com.softserve.edu01.pt1;

import java.util.Scanner;

public class PracticalTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Input second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Input third number: ");
        double num3 = scan.nextDouble();
        double result = (num1 + num2 + num3) / 3;
        System.out.println(result);
    }
}
