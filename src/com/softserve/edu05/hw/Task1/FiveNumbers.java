package com.softserve.edu05.hw.Task1;

import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        int[] array = new int[5];
        array = fillArray(array);
        int[] answers = tasks(array);
        System.out.println("position of second positive number: " + answers[0]);
        System.out.println("minimum value and its position in the array: " + answers[1] + " " + answers[2]);
        System.out.println("product of all entered even numbers: " + answers[3]);
    }

    public static int[] fillArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] tasks(int[] array) {
        int positionOfSecondPositive = 0;
        int positive = 0;
        int positionMin = 0;
        int min = array[0];
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            //position of second positive number
            if (array[i] > 0) {
                positive++;
                if (positive == 2) {
                    positionOfSecondPositive = i + 1;
                }
            }
            //minimum value and its position in the array
            if (array[i] < min) {
                min = array[i];
                positionMin = i + 1;
            }
            //product of all entered even numbers
            if (array[i] % 2 == 0) {
                if (array[i] == 0) {
                    continue;
                } else {
                    product *= array[i];
                }
            }
        }
        return new int[]{positionOfSecondPositive, min, positionMin, product};
    }
}
