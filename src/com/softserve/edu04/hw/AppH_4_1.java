package com.softserve.edu04.hw;

import java.util.Arrays;
import java.util.Scanner;

/*
Input three float numbers and check: are they all belong to the range [-5, 5]
*/
public class AppH_4_1 {
    public static void main(String[] args) {
        range();
        MaxMin();
    }

    public static void range() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number --> ");
        int a = sc.nextInt();
        System.out.print("Enter second number --> ");
        int b = sc.nextInt();
        System.out.print("Enter third number -->  ");
        int c = sc.nextInt();

        double arr[] = new double[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > -5 && arr[i] < 5) {
                x += 1;
            }
        }
        if (x == 3) {
            System.out.print("all numbers are in range");
        } else {
            System.out.print("one or more numbers not in range");
        }
    }

    public static void MaxMin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number --> ");
        int a = sc.nextInt();
        System.out.println("Enter second number --> ");
        int b = sc.nextInt();
        System.out.println("Enter third number -->  ");
        int c = sc.nextInt();
        double arr[] = new double[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        System.out.println("Max number is -- >  " + Arrays.stream(arr).max());
        System.out.println("Min number is -->  " + Arrays.stream(arr).min());
    }
}
