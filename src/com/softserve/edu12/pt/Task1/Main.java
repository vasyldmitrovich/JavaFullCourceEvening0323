package com.softserve.edu12.pt.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two sides of rectangle");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            System.out.println("Square of rectangle: " + squareRectangle(a,b));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    private static int squareRectangle(int a, int b){//Add throws ArithmeticException to signature of method, otherwise your application crashed
        if (a < 0 || b < 0){
            throw new ArithmeticException("U input negative values");
        }
        return a * b;
    }
}
