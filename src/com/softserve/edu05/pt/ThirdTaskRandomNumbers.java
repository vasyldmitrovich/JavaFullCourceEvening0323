package com.softserve.edu05.pt;

import java.util.Random;
import java.util.Arrays;

public class ThirdTaskRandomNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillTheArray(numbers);
        System.out.println("1) array of numbers: " + Arrays.toString(numbers));
        System.out.println("2) the biggest number: " + getTheBiggestNumber(numbers));
        System.out.println("3) sum of positive numbers: " + getSumOfPositives(numbers));
        int amountOfNegatives = getAmountOfNegatives(numbers);
        System.out.println("4) amount of negative numbers: " + amountOfNegatives);
        if(amountOfNegatives > 5) {
            System.out.println("There are more negative values in array.");
        } else if(amountOfNegatives < 5) {
            System.out.println("There are more positive values in array.");
        } else {
            System.out.println("There are an equal number of positive and negative numbers in array.");
        }
        System.out.println();
    }

    static void fillTheArray(int[] numbers){
        Random rnd = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rnd.nextInt(100 + 100) - 100;
        }
    }

    static int getTheBiggestNumber(int[] numbers){
        int maxValue = Integer.MIN_VALUE;
        for(int i : numbers){
            if(i > maxValue){
                maxValue = i;
            }
        }
        return maxValue;
    }

    static int getSumOfPositives(int[] numbers){
        int sum = 0;
        for(int i : numbers){
            if(i > 0){
                sum += i;
            }
        }
        return sum;
    }

    static int getAmountOfNegatives(int[] numbers){
        int amountOfNegatives = 0;
        for (int i : numbers){
            if(i < 0){
                amountOfNegatives++;
            }
        }
        return amountOfNegatives;
    }
}
