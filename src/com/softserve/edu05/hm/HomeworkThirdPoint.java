package com.softserve.edu05.hm;

import java.util.Scanner;

public class HomeworkThirdPoint {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();

        }
        int minNumber = array[0];
        int indexMinNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
                indexMinNumber = i;
            }
        }
        System.out.println("The smallest number in Array- " + minNumber + "  and your position in array - " + indexMinNumber);
        System.out.println("The product of even number in array = " + productNumber(array));

    }

    public static int productNumber(int[] array) {
        int product = 1;
        for (int j : array) {
            if (j == 0) continue;
            if (j % 2 == 0) {
                product *= j;
            }
        }
        if(product==1)return 0;
        return product;
    }
}

