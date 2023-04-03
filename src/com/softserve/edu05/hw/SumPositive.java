package com.softserve.edu05.hw;
import java.util.Scanner;
public class SumPositive {
    public static void main(String[] args) {
        calc();
    }
    public static void calc(){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int positiveSum = 0, negativeProduct = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                positiveSum += numbers[i];
            }
        }

        for (int i = 5; i < 10; i++) {
            if (numbers[i] < 0) {
                negativeProduct *= numbers[i];
            }
        }

        if (positiveSum > 0) {
            System.out.println("The sum of the first five positive numbers is: " + positiveSum);
        } else {
            System.out.println("The product of the last five negative numbers is: " + negativeProduct);
        }
    }
}
