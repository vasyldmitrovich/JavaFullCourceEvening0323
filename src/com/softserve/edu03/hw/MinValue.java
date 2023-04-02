package com.softserve.edu03.hw;

import java.util.Scanner;
public class MinValue {
    public static void main(String[] args) {
        int minValue;

        int n1 = getNumber("Input the first number:");
        int n2 = getNumber("Input the second number:");
        int n3 = getNumber("Input the third number:");

        minValue = n1;
        if(n2 < minValue){
            minValue = n2;
        }
        if(n3 < minValue){
            minValue = n3;
        }

        System.out.print("The smallest number is: " + minValue);
    }

    static int getNumber(String message){
        Scanner sc = new Scanner(System.in);
        System.out.print(message + " ");
        return sc.nextInt();
    }
}

