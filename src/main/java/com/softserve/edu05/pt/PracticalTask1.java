package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class PracticalTask1 {
    public static void main(String[] args) {
        int arr[] = {3, 7, 5, 9, 1};
        Arrays.sort(arr);
        System.out.println("arr: " + Arrays.toString(arr));

        int array[] = new int[5];
        array[0] = 2;
        array[1] = 4;
        array[2] = 6;
        array[3] = 8;
        array[4] = 10;
        System.out.println("array: " + Arrays.toString(array));
        int sum = 0;
        double average;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i]; // sum += array[i];
        }
        average = sum / array.length;
        System.out.println("Average value is: " + average);

        System.out.print("Введіть число для пошуку: ");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        boolean existInArray = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                existInArray = true;
                break;
            }
        }
        if (existInArray) {
            System.out.println("Ваше число " + value + " є в масиві.");
        } else {
            System.out.println("Такого числа немає в масиві.");
        }
    }
}
