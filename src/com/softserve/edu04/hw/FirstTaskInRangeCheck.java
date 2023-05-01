package com.softserve.edu04.hw;

import java.util.Scanner;
public class FirstTaskInRangeCheck {
    public static void main(String[] args) {

        float num1 = getTheNumber("first");
        float num2 = getTheNumber("second");
        float num3 = getTheNumber("third");

        System.out.println("" + num1 + " is " + ((num1 >= -5 && num1 <= 5)?"":"not ") + "in range [-5,5]");
        System.out.println("" + num2 + " is " + ((num2 >= -5 && num2 <= 5)?"":"not ") + "in range [-5,5]");
        System.out.println("" + num3 + " is " + ((num3 >= -5 && num3 <= 5)?"":"not ") + "in range [-5,5]");

    }

    //Good
    static float getTheNumber(String textNumber){
        System.out.print("Input the " + textNumber + " number: ");
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        return number;
    }
}
