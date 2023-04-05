package com.softserve.edu03.pt.Task1;

import java.util.Scanner;

public class Nums {
    /*Please Reformat code, must be spaces between methods*/
    public int getTotal(int a, int b) {
        return a + b;
    }

    public double getAverage(int a, int b) {
        return (double) (a + b) / 2;
    }

    public static int getNumber(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextInt();
    }
}
