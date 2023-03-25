package com.softserve.edu04.pt04;

import java.util.Scanner;

/*
Find out and output result how many of them are odd.
 */
public class PracticalTask01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть три числа:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        //Checking entered numbers for parity
        int oddCount = 0; //counter variable of even numbers
        if (num1 % 2 != 0) {
            oddCount++;
        }
        if (num2 % 2 != 0) {
            oddCount++;
        }
        if (num3 % 2 != 0) {
            oddCount++;
        }
        System.out.println("Кількість непарних чисел: " + oddCount);
    }
}
