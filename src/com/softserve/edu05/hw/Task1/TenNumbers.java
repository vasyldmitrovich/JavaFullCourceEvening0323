package com.softserve.edu05.hw.Task1;

import java.util.Scanner;

public class TenNumbers {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);
        if (positive(array)) {
            sumOfFirstFive(array);
        } else {
            productOfLastFive(array);
        }


    }

    public static void fillArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public static boolean positive(int[] array) {
        boolean check = true;
        for (int i = 0; i < 5; i++) {
            if (array[i] < 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void sumOfFirstFive(int[] array) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += array[i];
        }
        System.out.println("Sum of first five elements: " + sum);
    }

    public static void productOfLastFive(int[] array) {
        int prod = 1;
        for (int i = 5; i < 10; i++) {
            prod *= array[i];
        }
        System.out.println("Product of last five elements: " + prod);
    }
}
