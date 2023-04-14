package com.softserve.edu05.hw;

import java.util.Scanner;
public class SecondTaskDoWhileCalculator {
    public static void main(String[] args) {
        int num1, num2;

        do{
            num1 = getNumber("First number: ");
            num2 = getNumber("Second number: ");
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } while (answer("Do you want to perform the operation again (y/n)? "));
    }

    static boolean answer(String message){
        System.out.print(message);
        return (new Scanner(System.in).next().equals("y"))? true: false;
    }

    static int getNumber(String message){
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }
}
