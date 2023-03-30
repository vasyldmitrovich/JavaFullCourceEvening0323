package com.softserve.theorlovalexx1.hw01;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input radius: ");
        int radius = scan.nextInt();
        float p = 3.14F;
        double area = p * radius * radius;
        System.out.println("Area: " + area);
        double perimeter = 2 * p * radius;
        System.out.println("Perimeter: " + perimeter);

        System.out.print("What is your name: ");
        String name = scan.nextLine();
        System.out.println("Where are you live, " + name + "?");
        String address = scan.nextLine();
        System.out.println("I live in " + address + ".");

        System.out.println("Cost: ");
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        int c3 = scan.nextInt();
        System.out.println("Time: ");
        int t1 = scan.nextInt();
        int t2 = scan.nextInt();
        int t3 = scan.nextInt();
        int res1 = c1 * t1;
        int res2 = c2 * t2;
        int res3 = c3 * t3;
        System.out.println("First call cost: " + res1);
        System.out.println("Second call cost: " + res2);
        System.out.println("Third call cost: " + res3);
        System.out.println("\nTotal calls pay: " + (res1+res2+res3));
    }
}