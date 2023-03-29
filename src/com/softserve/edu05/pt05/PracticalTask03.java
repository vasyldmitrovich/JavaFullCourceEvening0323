package com.softserve.edu05.pt05;

import java.util.Arrays;
import java.util.Random;

public class PracticalTask03 {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(10, -1000, 1000);
        System.out.println(Arrays.toString(numbers));

        /*subtask1
            Print the largest number in an array
         */
        int maxNumber = findMaxNumber(numbers);
        System.out.println("Max number: " + maxNumber);

        /*
        subtask2
            Print the sum of positive integers?
         */
        int sumPositiveNumber = sumOfPositiveNumber(numbers);
        System.out.println("sumOfPositiveNumber: " + sumPositiveNumber);

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
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0) {
                sum = sum + numbers[i];
            }
        }
        return sum;
    }


}
