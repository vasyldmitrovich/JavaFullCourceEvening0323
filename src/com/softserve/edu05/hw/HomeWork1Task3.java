package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork1Task3 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 integer numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int positiveCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            }
            if (positiveCount == 2) {
                System.out.println(i);
                break;
            }
        }

        int min = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
                position = i;
            }
        }
        System.out.println("Minimum value is " + min + " and his position " + position);

        int product = 1;
        for (int arrs: arr){
            if(arrs !=0 && arrs%2==0){
                product *= arrs;
            }
        }
        System.out.println("Product is " + product);
    }
}
