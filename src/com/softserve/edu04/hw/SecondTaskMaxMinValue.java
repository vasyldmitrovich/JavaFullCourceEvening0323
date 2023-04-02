package com.softserve.edu04.hw;

import java.util.Scanner;
public class SecondTaskMaxMinValue {
    public static void main(String[] args) {
        int num1 = getNumber("first");
        int num2 = getNumber("second");
        int num3 = getNumber("third");

        System.out.println("\tMin value: " + getMinValue(num1, num2, num3));
        System.out.println("\tMax value: " + getMaxValue(num1, num2, num3));
    }

    static int getMinValue(int...args){
        int minValue = Integer.MAX_VALUE;

        for(int i : args){
            minValue = (i < minValue)? minValue = i: minValue;
        }

        return minValue;
    }

    static int getMaxValue(int...args){
        int maxValue = Integer.MIN_VALUE;

        for(int i : args){
            maxValue = (i > maxValue)? maxValue = i: maxValue;
        }

        return maxValue;
    }

    static int getNumber(String textNumber){
        System.out.print("Input " + textNumber + " number: ");
        return new Scanner(System.in).nextInt();
    }
}
