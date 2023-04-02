package com.softserve.edu04.pt4;

import com.softserve.edu03.pt3.Numbers;

import java.util.Scanner;

public class PracticalTask1 {
    static int countOdd = 0;
    public static void main(String[] args) {
        Scanner scanNumber = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanNumber.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanNumber.nextInt();
        System.out.print("Enter third number: ");
        int number3 = scanNumber.nextInt();
        if (isNumberOdd(number1)) {
            countOdd += 1;
        }
        if (isNumberOdd(number2)) {
            countOdd += 1;
        }
        if (isNumberOdd(number3)) {
            countOdd += 1;
        }
        System.out.println("There are " + countOdd + " odd number.");
    }

    public static boolean isNumberOdd(int number){
        return number % 2 == 1;
    }
}
