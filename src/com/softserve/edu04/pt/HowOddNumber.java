package com.softserve.edu04.pt;

import java.util.Scanner;

public class HowOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.print("Enter a list of numbers separated by spaces: ");
        String[] numbers = scanner.nextLine().split(" ");

        for (String number : numbers) {
            int n = Integer.parseInt(number);
            if (n % 2 != 0) {
                count++;
            }
        }

        System.out.println("The number of odd numbers is: " + count);
    }
}

