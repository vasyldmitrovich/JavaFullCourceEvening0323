package com.softserve.edu05.pt;

import java.util.Arrays;

public class Pt3 {
    public static void main(String[] args) {

        int min = -100;
        int max = 100;
       int[] randomNumber = new int[10];
        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        System.out.println("Arrays random number="+Arrays.toString(randomNumber));
        Arrays.sort(randomNumber);
        System.out.println("The biggest number in the array- "+ randomNumber[randomNumber.length-1]);
        System.out.println("Sum of positive number ="+ sumOfPositiveNumber(randomNumber));
        System.out.println("The number of negative numbers- " +numberOfNegativeNumber(randomNumber));

        if (numberOfNegativeNumber(randomNumber)>numberOfPositiveNumber(randomNumber)){
            System.out.println("There are more negative values in the array");}
        if (numberOfNegativeNumber(randomNumber)<numberOfPositiveNumber(randomNumber)){
            System.out.println("There are more positive values in the array");}
        if (numberOfNegativeNumber(randomNumber)==numberOfPositiveNumber(randomNumber)){
            System.out.println("There are an equal number of positive and negative values in the array");}
        }


    public static int sumOfPositiveNumber(int [] num){
    int sum=0;
        for (int j : num) {
            if (j > 0) {
                sum += j;

            }

        }
        return sum;
}
public static int numberOfNegativeNumber(int[] num){
   int number=0;
        for(int j : num){
       if (j<0){
           number++;
       }
    }return number;
}
    public static int numberOfPositiveNumber(int[] num){
        int number=0;
        for(int j : num){
            if (j>0){
                number++;
            }
        }return number;
    }
}
