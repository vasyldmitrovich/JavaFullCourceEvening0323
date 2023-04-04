package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork1Task2 {
    public static void main(String[] args) {
        int array[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) - 10;
        }
        System.out.println("Array: " + Arrays.toString(array));

        int res;
        if (array[0] > 0 && array[1] > 0 && array[2] > 0 && array[3] > 0 && array[4] > 0) {
            res = array[0] + array[1] + array[2] + array[3] + array[4];
            System.out.println("Sum of the first five positive numbers is " + res);
        } else {
            res = array[5] * array[6] * array[7] * array[8] * array[9];
            System.out.println("Product of the last numbers is " + res);
        }
    }
}
