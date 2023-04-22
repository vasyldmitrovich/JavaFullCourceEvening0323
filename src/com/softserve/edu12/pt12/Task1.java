package com.softserve.edu12.pt12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input first integer parameters 'a'");
            int a = sc.nextInt();
            System.out.println("Input second integer parameters 'b'");
            int b = sc.nextInt();
            System.out.println(squareRectangle(a, b));
        } catch (Exception e) {
            System.out.println("Incorrect data");
        }
    }

    private static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("Should be positive numbers");
            throw new ArithmeticException();
        }
        System.out.println("Square of rectangle");
        return a * b;
    }
}
