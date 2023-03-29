package com.softserve.edu05.hw05.hw1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ***first
//        System.out.println("Input month number");
//        int month = sc.nextInt();
//        System.out.println("Days in your month = "+ numberOfDays(month));

//        ***second
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number");
            array[i] = sc.nextInt();
       }
        System.out.println("Sum of first five positive numbers");
        System.out.println(ArrayOfTen.sumOfFirstFive(array));
        if (ArrayOfTen.sumOfFirstFive(array)==0){
            System.out.println("Product of last five positive numbers");
            System.out.println(ArrayOfTen.productLastFive(array));
        }

//        ***third
//        int array2[] = new int[5];
//        for (int i = 0; i < array2.length; i++) {
//            System.out.println("Enter number");
//            array2[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(array2));
//        System.out.println("Position second positive number in your array");
//        System.out.println(positionOfPosNumber(array2));
//        minValue(array2);
//        productOfEven(array2);
    }
}
