package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class PracticalTask3 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) - 50;
        }
        System.out.println("Arr: " + Arrays.toString(arr));

        int maxValueInArr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValueInArr) {
                maxValueInArr = arr[i];
            }
        }
        System.out.println("Biggest value in array is: " + maxValueInArr);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println("The sum of positive numbers is: " + sum);

        int countNegative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                countNegative++;
            }
        }
        System.out.println("The number of negative numbers in the array: " + countNegative);

        int countPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPositive++;
            }
        }
        System.out.println("The number of positive numbers in the array: " + countPositive);

        if (countNegative > countPositive) {
            System.out.println("There are more negative values in the array.");
        }
        if (countNegative < countPositive) {
            System.out.println("There are more positive values in the array.");
        }
        if (countNegative == countPositive) {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }
}
