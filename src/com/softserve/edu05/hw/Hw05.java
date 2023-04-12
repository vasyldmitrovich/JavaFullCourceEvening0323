package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Hw05 {
    public static void main(String[] args) {
        //Task_1.1
        System.out.println("Task 1.1");
        System.out.print("Input month number(1..12): ");
        Scanner sc = new Scanner(System.in);
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = sc.nextInt();
        System.out.println("This month has " + days[month] + " days.");

        //Task_1.2
        System.out.println("Task 1.2");
        System.out.println("Please input 10 integer numbers: ");
        int[] num = new int[10];
        for (int i = 0; i <= 9; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        if (num[0] >= 0 && num[1] >= 0 && num[2] >= 0 && num[3] >= 0 && num[4] >= 0) {
            int sum = num[0] + num[1] + num[2] + num[3] + num[4];
            System.out.println("Sum of first five elements is: " + sum);
        } else {
            int prod = num[5] * num[6] * num[7] * num[8] * num[9];
            System.out.println("Product of last five elements is: " + prod);
        }
        //Task_1.3
        System.out.println("Task 1.3");
        System.out.println("Please input 5 integer numbers: ");
        int[] five = new int[5];
        for (int i = 0; i <= 4; i++) {
            five[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(five));
        int counter = 0;
        for (int i = 0; i <= 4; i++) {
            if (five[i] >= 0) {
                counter++;
            }
            if (counter == 2) {
                System.out.println("Second positive element on position: " + i);
                break;
            }
        }
        int min = five[0];
        int minind = 0;
        int prod = 1;
        for (int ind = 0; ind <= 4; ind++) {
            if (five[ind] < min) {
                min = five[ind];
                minind = ind;
            }

            if (five[ind] != 0 & five[ind] % 2 == 0) {
                prod = prod * five[ind];
            }
        }
        System.out.println("Min values is : " + five[minind] + " on position " + minind);
        System.out.println("Product of elements is " + prod);


        //Task_2
        Scanner str = new Scanner(System.in);
        System.out.println("Task 2");
        boolean response = false;
        do {
            System.out.println("Please input 2 integer numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("a*b=" + a * b);
            System.out.println("Would you like to continue? (yes/no)");
            String resp = str.nextLine();
            response = resp.equals("yes") ? true : false;
        } while (response == true);
    }

}


