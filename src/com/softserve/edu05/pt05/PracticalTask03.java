package com.softserve.edu05.pt05;

import java.util.Arrays;
import java.util.Random;

public class PracticalTask03 {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(10, -1000, 1000);
        System.out.println(Arrays.toString(numbers));

        // subtask1 - Print the largest number in an array
        int maxNumber = findMaxNumber(numbers);
        System.out.println("The largest number in the array: " + maxNumber);

        // subtask2 - Print the sum of positive integers?
        int sumPositiveNumber = sumOfPositiveNumber(numbers);
        System.out.println("Sum of positive numbers: " + sumPositiveNumber);

        //subtask3 - Count the number of negative numbers
        int negativeCount = negativeCountNumbers(numbers);
        System.out.println("Count the number of negative numbers: " + negativeCount);

        //subtask4 - Determining which numbers in an array are more negative or positive
        int positiveCount = positiveCountNumbers(numbers);
        if(negativeCount > positiveCount) {
            System.out.println("There are more negative values in the array.");
        } else if (negativeCount < positiveCount) {
            System.out.println("There is more positive values in the array");
        } else {
            System.out.println("The array contains an equal number of positive and negative values");
        }

    }

    public static int[] generateRandomNumbers(int count, int min, int max) {
        int[] numbers = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt((max - min) + 1) + min;
        }
        return numbers;
    }

    public static int findMaxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int sumOfPositiveNumber (int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number > 0) {
                sum = sum + number;
            }
        }
        return sum;
    }

    public static int negativeCountNumbers (int[] numbers) {
        int negativeCount = 0;
        for (int number : numbers) {
            if (number < 0) {
                negativeCount++;
            }
        }
        return negativeCount;
    }

    public static int positiveCountNumbers (int[] numbers) {
        int positiveCount = 0;
        for (int number : numbers) {
            if (number > 0) {
                positiveCount++;
            }
        }
        return positiveCount;
    }
}
