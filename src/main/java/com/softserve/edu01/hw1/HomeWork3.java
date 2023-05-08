package com.softserve.edu01.hw1;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cost per minute: ");
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        int c3 = scan.nextInt();
        System.out.println("Call time: ");
        int t1 = scan.nextInt();
        int t2 = scan.nextInt();
        int t3 = scan.nextInt();
        int res1 = c1 * t1;
        int res2 = c2 * t2;
        int res3 = c3 * t3;
        System.out.println("First call cost: " + res1);
        System.out.println("Second call cost: " + res2);
        System.out.println("Third call cost: " + res3);
        System.out.println("\nTotal calls pay: " + (res1 + res2 + res3));
    }
}
