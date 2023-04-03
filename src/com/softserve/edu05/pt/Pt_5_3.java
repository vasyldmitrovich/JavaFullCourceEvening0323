package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pt_5_3 {
    public static void main(String[] args) {
        Random();
    }

    public static void Random() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(200) - 100;
            array[i] = num;
        }
        System.out.println(Arrays.toString(array));

        int biggest = array[0];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
            if (array[i] < 0) {
                count += 1;

            }
        }


        System.out.println("The biggest is " + biggest);
        System.out.println("Number of negative numbers: " + count);
        if (count > 5) {
            System.out.println("There are more negative values in the array!");
        } else if (count < 5) {
            System.out.println("There are more positive values in the array!");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array!");
        }


    }

}
