package com.softserve.edu02.practic.taskOne;

import java.util.Scanner;

public class WorkWithNumbers {
    public double getTotal(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public double getAverage(double numberOne, double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public static double getNumber(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
