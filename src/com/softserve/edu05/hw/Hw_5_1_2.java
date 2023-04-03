package com.softserve.edu05.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hw_5_1_2 {
    public static void main(String[] args) {
        calc();

    }

    public static void calc() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(Arrays.asList());
        int sum = 0;
        int product = 0;
        /*Adding to list*/
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter " + (i + 1) + " number: ");
            int input = sc.nextInt();
            list.add(input);
        }
        /*Checking if 5 first numbers are positive */
        for (int i = 0; i < 5; i++) {
            if (list.get(i) > 0) {
                sum += 1;
            }
        }
        /*If all 5 first numbers are positive we sum them*/
        if (sum == 5) {
            sum = 0;
            for (int i = 0; i < 5; i++) {
                if (list.get(i) > 0) {
                    sum += list.get(i);

                }
            }
            System.out.println("Sum of 5 first numbers: " + sum);
        } else if (sum != 5) {
            System.out.println("maybe not all 5 first numbers are positive");
        }
//_____________________product_______________________
        /*Checking if 5 last numbers are negative */
        for (int i = 5; i < 10; i++) {
            if (list.get(i) < 0) {
                product += 1;
            }
        }
        /*If all 5 last numbers are negative we multiply them*/
        if (product == 5) {
            product = 1;
            for (int i = 5; i < 10; i++) {
                if (list.get(i) < 0) {
                    product *= list.get(i);

                }
            }
        System.out.println("The product of last 5 numbers is: "+product);
        }else if (product != 5) {
            System.out.println("maybe not all 5 last numbers are negative");
        }
    }
}
