package com.softserve.edu03.hm03;

import java.util.Scanner;

public class Number {
    static final String OUTLINE = "The smallest number is ";

    public int minNumber () {

        Scanner scannerNumber = new Scanner(System.in);

        //Entering the first number
        System.out.print("Input the first number: ");
        int a = scannerNumber.nextInt();

        //Entering the second number
        System.out.print("Input the second number: ");
        int b = scannerNumber.nextInt();

        //Entering the third number
        System.out.print("Input the third number: ");
        int c = scannerNumber.nextInt();

        scannerNumber.close();

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println(OUTLINE + min);

        return min;
    }
}
