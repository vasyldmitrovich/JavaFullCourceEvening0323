package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Pt05 {
    public static void main(String[] args) {
        //Task_1.1
        String[] strArr = {"test", "ab", "bc", "abc", "test", "sort"};
        System.out.print("Source array: ");
        for (String string : strArr) System.out.print(string + " ");
        System.out.println();
        System.out.print("Sorted array: ");
        Arrays.sort(strArr);
        for (String string : strArr) System.out.print(string + " ");
        String elements = Arrays.toString(strArr);

        //Task_1.2
        System.out.println();
        int[] avg = {1, 2, 3, 4, 6};
        int sum = 0;
        for (int a : avg) sum = +a;
        System.out.println("Average is: " + (double) sum / 5.0);

        //Task_1.3
        Scanner sc = new Scanner(System.in);
        String inpt = sc.nextLine();
        int index = Arrays.binarySearch(strArr, inpt);
        System.out.println("StrArray = " + elements);
        System.out.println("Position of element with value " + inpt + " is: " + index);


        Arrays.sort(avg);
        String[] strOfint = Arrays.stream(avg)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        int ind = Arrays.binarySearch(strOfint, inpt);
        System.out.println("Int array = " + Arrays.toString(strOfint));
        System.out.println("Position of element with value " + inpt + " is: " + ind);

        //Task 2
        System.out.print("Input an integer number to check if it's prime number: ");
        int i, m = 0, flag = 0;
        int n = sc.nextInt();
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }


    }
}
