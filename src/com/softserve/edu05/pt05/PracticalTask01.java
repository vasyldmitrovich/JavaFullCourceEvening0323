package com.softserve.edu05.pt05;

import java.util.Arrays;
import java.util.Scanner;

public class PracticalTask01 {
    public static void main(String[] args) {

        //subtask 1
        String[] strArray = {"banana", "apple", "orange", "pear", "grape"};
        Arrays.sort(strArray);
        System.out.println("Subtask 1. Sorted array of strings: " + Arrays.toString(strArray));

        //subtask 2
        double[] numArray = {4.5, 2.3, 6.7, 1.2, 9.1};
        double sum = 0;
        for (double num : numArray) {
            sum += num;
        }
        double avg = sum / numArray.length;
        System.out.println("Subtask 2. The average value of the array elements: " + avg);

        //subtask 3
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value to search in the array: ");
        double searchValue = scan.nextDouble();
        boolean containsValue = false;
        for (double num : numArray) {
            if (num == searchValue) {
                containsValue = true;
                break;
            }
        }
        scan.close();
        System.out.println("Subtask 3. Array " + (containsValue ? "" : "does not") + "contain the entered value");
    }
}
