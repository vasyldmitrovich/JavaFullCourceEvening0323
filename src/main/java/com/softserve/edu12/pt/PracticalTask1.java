package com.softserve.edu12.pt;

import java.util.Scanner;

public class PracticalTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Enter int a: ");
                a = Integer.parseInt(scan.nextLine());

                System.out.print("Enter int b: ");
                b = Integer.parseInt(scan.nextLine());

                int res = squareRectangle(a, b);
                System.out.println("Rectangle: " + res);

                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter Integer!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scan.close();
    }

    public static int squareRectangle(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Error! Negative integers!");
        }
        return a * b;
    }
}
