package com.softserve.edu04.hw04.hw1;

import java.util.Scanner;
public class FloatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first float number");
        float first = scanner.nextFloat();
        System.out.println("Input second float number");
        float second = scanner.nextFloat();
        System.out.println("Input third float number");
        float third = scanner.nextFloat();
        if (first <= 5 && first >= -5) {
            System.out.println("First number belong [-5;5]");
        } else {
            System.out.println("First number doesn't belong [-5;5]");
        }
        if (second <= 5 && second >= -5) {
            System.out.println("Second number belong [-5;5]");
        } else {
            System.out.println("Second number doesn't belong [-5;5]");
        }
        if (third <= 5 && third >= -5) {
            System.out.println("Third number belong [-5;5]");
        } else {
            System.out.println("Third number doesn't belong [-5;5]");
        }
    }
}
