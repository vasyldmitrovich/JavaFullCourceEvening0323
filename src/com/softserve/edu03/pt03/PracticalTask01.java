package com.softserve.edu03.pt03;

import java.util.Scanner;

public class PracticalTask01 {
    public static void main(String[] args) {
        Number number1 = new Number();
        Number number2 = new Number();

        //receiving data from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        //Print result
        System.out.printf("The sum of %d and %d is ", a, b);
        System.out.println(number1.getTotal(a,b));
        System.out.printf("The average of %d and %d is ", a, b);
        System.out.println(number2.getAverage(a,b));
    }
}

class Number {
    public int getTotal (int a, int b) {
        return (a + b);
    }

    public double getAverage (int a, int b) {
        return ((double) (a+b)/2);
    }
}