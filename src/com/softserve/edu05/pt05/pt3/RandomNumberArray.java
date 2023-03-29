package com.softserve.edu05.pt05.pt3;

import java.util.Arrays;

public class RandomNumberArray {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("The biggest number: " + biggestNumber(array));
        System.out.println("Sum of positive numbers: " + sumOfPositiveNum(array));
        System.out.println("Count of negative numbers: " + countNegative(array));
        whatMore(array);
    }

    public static int biggestNumber(int array[]) {
        Arrays.sort(array);
        return array[9];
    }

    public static int sumOfPositiveNum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                continue;
            }
            sum = sum + array[i];
        }
        return sum;
    }

    public static int countNegative(int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public static void whatMore(int array[]) {
        int countNeg = countNegative(array);
        int countPos = array.length - countNeg;
        if (countNeg > countPos) {
            System.out.println("Negative numbers more than positive");
        }
        if (countNeg < countPos) {
            System.out.println("Positive numbers more that negative");
        } else System.out.println("Positive numbers equals negative numbers");
    }
}
