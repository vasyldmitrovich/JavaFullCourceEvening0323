package com.softserve.edu12.hw12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input first number");
            int first = sc.nextInt();
            System.out.println("Input second number");
            int second = sc.nextInt();
            dev(first, second);
        } catch (Exception ex) {
            System.out.println("Some exception");
        }
    }

    private static void dev(int a, int b) {
        try {
            double rez = a / b;
            System.out.println(rez);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (Exception exception) {
            System.out.println("Something else");
        }
    }
}
