package com.softserve.edu05.pt;


import java.util.Scanner;

public class Pt_5_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int number: ");
        int search = sc.nextInt();
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 1; i < 5; i++) {
            if (array[i] == search) {
                System.out.println("The number is in array!");
            }
        }
    }


}

