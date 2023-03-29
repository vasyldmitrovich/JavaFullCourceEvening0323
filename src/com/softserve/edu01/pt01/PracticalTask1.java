package com.softserve.edu01.pt01;


import java.util.Scanner;

public class PracticalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        int a = sc.nextInt();
        System.out.println("Input second number");
        int b = sc.nextInt();
        System.out.println("Input third number");
        int c = sc.nextInt();
        System.out.println((a+b+c)/3);
    }
}
