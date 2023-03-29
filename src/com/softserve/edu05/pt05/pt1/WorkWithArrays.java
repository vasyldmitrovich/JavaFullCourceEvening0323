package com.softserve.edu05.pt05.pt1;

import java.util.Arrays;
import java.util.Scanner;

public class WorkWithArrays {
    public static void main(String[] args) {
        String array[] = {"Alina", "Tanya", "Katerina", "Olga"};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();

        int arrayInt[] = {6, -6, 7, 122, 58};
        int average = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            average = average + arrayInt[i];
        }
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Average value: " + (average / arrayInt.length));
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int number = sc.nextInt();
        System.out.println("You're number is in array:");
        System.out.println(Arrays.stream(arrayInt).anyMatch(temp -> temp == number));
        //System.out.println(Arrays.asList(arrayInt).contains(number));

    }
}
