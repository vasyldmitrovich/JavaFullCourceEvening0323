package com.softserve.theorlovalexx1.pt01;

import java.util.Scanner;

public class PracticalTask1 {
    public static void main(String[] args) {
        System.out.println("Input text please.");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String s3 = scan.nextLine();
        System.out.println(s3 + "\n" + s2 + "\n" + s1);

        System.out.print("Input first number: ");
        int num1 = scan.nextInt();
        System.out.print("Input second number: ");
        int num2 = scan.nextInt();
        System.out.print("Input third number: ");
        int num3 = scan.nextInt();
        int result = (num1 + num2 + num3)/3;
        System.out.println(result);

        System.out.println("Please enter your variables: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        System.out.println("How are you? ");
        String answer = scan.nextLine();
        System.out.println("Your answer is '" + answer + "'");
    }
}