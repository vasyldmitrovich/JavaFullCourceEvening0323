package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArrayApp {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getRandomNumber();
            //System.out.println(numbers[i]);
        }
        System.out.println("Array of random numbers: " + Arrays.toString(numbers));

        // Output the biggest number in the array
        Integer max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The biggest number in array is: " + max.toString());

        // Output the sum of positive numbers
        Integer sumPositive = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sumPositive = sumPositive + numbers[i];
            }
        }
        System.out.println("The sum of positive numbers: " + sumPositive);

        // Count the number of negative numbers
        Integer countNegative = countElements(numbers, false);
        System.out.println("There are : " + countNegative.toString() + " negative numbers");

        // Determine whether there are more negative or positive values in the array
        Integer countPositive = countElements(numbers, true);
        if (countPositive == countNegative) {
            System.out.println("There are an equal number of positive and negative values in the array");
        } else if (countPositive < countNegative) {
            System.out.println("There are more negative values in the array");
        } else {
            System.out.println("There are more positive values in the array");
        }
    }

    public static Integer countElements(Integer[] numbers, boolean isPositive) {
        Integer countPositive = 0;
        Integer countNegative = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                countPositive = countPositive + 1;
            } else {
                countNegative = countNegative + 1;
            }
        }
        if (isPositive)
            return countPositive;
        else
            return countNegative;
    }

    public static Integer getRandomNumber() {
        Integer min = -100;
        Integer max = 100;
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
