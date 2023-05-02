package com.softserve.edu12.pt12.task1;

import java.util.Scanner;

import static java.lang.System.*;

public class AppSquareRectangle {
    public static int squareRectangle(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Input values must be positive.");
        }
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        out.print("Enter value for 'a': ");
        String inputA = scanner.nextLine();
        out.print("Enter value for 'b': ");
        String inputB = scanner.nextLine();
        //Ok
        try {
            int a = Integer.parseInt(inputA);
            int b = Integer.parseInt(inputB);

            int result = squareRectangle(a, b);
            out.println("Area of rectangle: " + result);
        } catch (NumberFormatException e) {
            out.println("Error: Input values must be numeric.");
        } catch (IllegalArgumentException e) {
            out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
