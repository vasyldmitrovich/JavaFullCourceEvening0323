package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Pt1 {

    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry", "date", "elderberry"};
        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));

        int[] intArray = {5, 7, 10, 12, 15};
        int sum = 0;
        for (int j : intArray) {
            sum += j;
        }
        double average = (double) sum / intArray.length;
        System.out.println("Average value of int array: " + average);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search for in the arrays: ");
        String searchValue = scanner.nextLine();

        if (Arrays.asList(stringArray).contains(searchValue)) {
            System.out.println("String array contains " + searchValue);
        } else if (Arrays.stream(intArray).anyMatch(i -> i == Integer.parseInt(searchValue))) {
            System.out.println("Int array contains " + searchValue);
        } else {
            System.out.println("Value not found in any array.");
        }
    }
}


