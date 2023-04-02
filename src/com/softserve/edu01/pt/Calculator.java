package com.softserve.edu01.pt;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        int a = getNumber("Input value of A variable:");
        int b = getNumber("Input value of B variable:");

        String sign = getOperation("Choose the operation (input the sign)");

        switch (sign){
            case "+":
                addition(a, b);
                break;
            case "-":
                subtraction(a, b);
                break;
            case "*":
                multiplication(a, b);
                break;
            case "/":
                division(a, b);
                break;
        }
    }

    static int getNumber(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    static String getOperation(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.next();
    }

    static void addition (int a, int b){
        System.out.println(a + " + " + b + " = " + a + b);
    }

    static void subtraction (int a, int b){
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    static void multiplication (int a, int b){
        System.out.println(a + " * " + b + " = " + a * b);
    }

    static void division (double a, int b){
        double result = a / b;
        System.out.println(a + " / " + b + " = " + result);
    }
}
