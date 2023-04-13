package com.softserve.edu05.pt.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Create a string array and sort it
        String[] stringArray = {"c", "b", "d", "a"};
        Arrays.sort(stringArray);
        System.out.println("Sorted array: " + Arrays.toString(stringArray));

        //Create an array with 5 elements and calculate the average value
        Integer[] arrayWith5elements = {4, 4, 4, 5, 6, 6, 6, 7, 8, 9};
        int sum = 0;
        for (int i : arrayWith5elements) {
            sum += i;
        }
        double average = (double) sum / arrayWith5elements.length;
        System.out.println("Average: " + average);

        //Check if the array contains the value
        System.out.println("Input value what you want to find in array.");
        int search = scanner.nextInt();
        boolean count = false;
        for (int i = 0; i < arrayWith5elements.length; i++) {
            if (arrayWith5elements[i] == search) {
                System.out.println("Value " + search + " on position " + i);
                count = true;
            }
        }
        if (!count) {
            System.out.println("The array does not contain this value");
        }
    }
}
