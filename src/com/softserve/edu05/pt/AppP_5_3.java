package com.softserve.edu05.pt;


/*
Create an array of ten random integers using a random number generator. Output:
        • the biggest number in the array;
        • the sum of positive numbers;
        • count the number of negative numbers.
        • determine whether there are more negative or positive values in the array. If there are
        more negative values, output "There are more negative values in the array." Otherwise,
        output "There are more positive values in the array." If the counts are equal, output
        "There are an equal number of positive and negative values in the array.
*/

import java.util.Arrays;
import java.util.Random;

public class AppP_5_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[] = new int[6];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-20, 20);
            System.out.println(arr[i]);
        }
        System.out.println("Max number is --> " + Arrays.stream(arr).max());

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println("The sum of positive numbers is --> " + sum);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println("We have " + count + " negative numbers");


        int negative = 0;
        int positive = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            }
        }

        if (negative > positive) {
            System.out.println("There are more negative values in the array.");
        } else if (negative < positive) {
            System.out.println("There are more positive values in the array.");
        } else if (negative == positive) {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }

    }
}
