package com.softserve.edu12.hw12;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        readNumber(34, 67);
    }

    //Good
    private static int readNumber(int start, int end) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int num = sc.nextInt();
        if (num <= end && num >= start) {
            System.out.println("You're number is in the range between " + start + " and " + end);
            return num;
        } else {
            throw new Exception("You're number isn't correct");
        }
    }
}