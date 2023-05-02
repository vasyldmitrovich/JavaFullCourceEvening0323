package com.softserve.edu12.hm12.task1;

import java.util.Scanner;

import static java.lang.System.*;

public class DivisionCalculator {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(in)) {
            out.println("Enter the first number:");
            double num1 = scanner.nextDouble();
            out.println("Enter the first number:");
            double num2 = scanner.nextDouble();
            double result = div(num1, num2);
            out.println("Result: " + result);
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }


    //method, which calculates the dividing of two double type numbers
    public static double div(double num1, double num2) {
        if (num2 == 0) {//What will be ie 'b' will be equals -1 ???
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}
