package com.softserve.edu05.pt;

import java.util.Arrays;

public class Pt_5_1_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average = average / array.length;
        System.out.println("Average is: " + average);
    }
}
