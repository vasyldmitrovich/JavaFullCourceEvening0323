package com.softserve.edu05.hm;

import java.util.Scanner;

public class HomeWorkSecondPoint {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            nums[i] = scanner.nextInt();
        }
        int sum = 0;
        boolean allPositive = true;
        for (int i = 0; i < 5; i++) {
            if (nums[i] < 0) {
                allPositive = false;
                break;
            }
            sum += nums[i];
        }
        int product = 1;
        boolean allNegative = true;
        for (int i = 5; i < 10; i++) {
            if (nums[i] >= 0) {
                allNegative = false;
                break;
            }
            product *= nums[i];
        }
        if (allPositive) {
            System.out.println("sum of five number: " + sum);
        } else if (allNegative) {
            System.out.println("The product of the last 5 numbers: " + product);
        } else {
            System.out.println("The result could not be calculated because the first 5 numbers are not all positive and the last 5 numbers are not all negative.");
        }
    }
}
