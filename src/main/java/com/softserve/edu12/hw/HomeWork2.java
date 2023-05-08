package com.softserve.edu12.hw;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        try {
            int start = 1;
            int end = 100;
            int numbers[] = readNumber(start, end);
            System.out.println("Success! Your numbers in range!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] readNumber(int start, int end) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers between 1 to 100: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        if (number1 < start || number1 > end || number2 < start || number1 > end) {
            throw new Exception("Error! Numbers are not in range from 1 to 100!");
        }
        return new int[]{number1, number2};
    }
}
