package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class AppP_5_1 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String arr[] = {"y", "a", "b", "f","z","h"};
        System.out.println("Default array --> "+(Arrays.toString(arr)));
        Arrays.sort(arr);
        System.out.println("Sorted array --> "+Arrays.toString(arr));

        int arr_2[] = {1, 22,10, 2 , 5};
        int average = 0;

        for (int i = 0; i< arr_2.length; i++){
            average += arr_2[i];
        }
        average = average/ arr_2.length;
        System.out.println("The average of this array is --> "+average);

        System.out.println("Enter String value that you want to check --> ");
        String valueS = sc.nextLine();

        System.out.println("Enter int value that you want to check --> ");
        int valueI = sc.nextInt();

        for(int i  = 0; i<arr.length; i++){
            if (valueS.equals(arr[i])){
                System.out.println("Your String value is in array  ");
            }
        }

        for(int i  = 0; i<arr_2.length; i++){
            if (valueI == arr_2[i]){
                System.out.println("Your Int value is in array  ");
            }
        }
    }
}
