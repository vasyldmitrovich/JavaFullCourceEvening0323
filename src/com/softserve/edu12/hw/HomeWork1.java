package com.softserve.edu12.hw;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter int a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter int b: ");
            double b = scanner.nextDouble();
            double result = div(a, b);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //What will be if 'b' will be less than 0
    public static double div(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("Error! Division by zero.");
        }
        return a / b;
    }
}
