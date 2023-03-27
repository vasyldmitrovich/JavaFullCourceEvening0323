package edu04.practicalTask1;

import java.util.Scanner;

public class oddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int first = scanner.nextInt();
        System.out.println("Please enter second number");
        int second = scanner.nextInt();
        System.out.println("Please enter third number");
        int third = scanner.nextInt();
        System.out.println("Amount of odd numbers:");
        System.out.println(amountOddNumbers(first, second, third));
    }

    private static int amountOddNumbers(int first, int second, int third) {
        int amountOdd = 0;
        if (first % 2 != 0) {
            amountOdd++;
        }
        if (second % 2 != 0) {
            amountOdd++;
        }
        if (third % 2 != 0) {
            amountOdd++;
        }
        return amountOdd;
    }
}
