package com.softserve.edu01.pt1;

import java.util.Scanner;

public class PracticalTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your variables: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
