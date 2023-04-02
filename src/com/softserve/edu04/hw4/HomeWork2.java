package com.softserve.edu04.hw4;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner intScan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numb1 = intScan.nextInt();
        System.out.print("Enter second number: ");
        int numb2 = intScan.nextInt();
        System.out.print("Enter third number: ");
        int numb3 = intScan.nextInt();
        int arrNum[] = new int[3];
        arrNum[0] = numb1;
        arrNum[1] = numb2;
        arrNum[2] = numb3;
        int min = arrNum[0];
        int max = arrNum[0];
        for (int i = 1; i < arrNum.length; i++) {
            if (arrNum[i] < min) {
                min = arrNum[i];
            }
            if (arrNum[i] > max) {
                max = arrNum[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
