package com.softserve.edu12.hm12.task2;

import java.util.Scanner;

import static java.lang.System.*;

public class NumberReader {
    /*that read from console integer number and return it, if it is in the range [start...end].
    If an invalid number or non-number text is read, the method should throw an exception
     */
    public static int readNumber(int start, int end) throws Exception {
        Scanner scanner = new Scanner(in);
        out.print("Enter an integer between " + start + " and " + end + ": ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num >= start && num <= end) {
                return num;
            } else throw new Exception("Number is not in the valid range.");
        } else {
            throw new Exception("Invalid input. Please enter an integer.");
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int start = 1;
        int end = 100;
        try {//Good
            for (int i = 0; i < 10; i++) {
                numbers[i] = readNumber(start, end);
                start = numbers[i] + 1; // Ensure numbers are increasing
            }
            out.println("Successfully read 10 numbers:");
            for (int i = 0; i < 10; i++) {
                out.print(numbers[i] + " ");
            }
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
}
