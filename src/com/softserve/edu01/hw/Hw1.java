package com.softserve.edu01.hw;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Hw1 {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
    }

    private static void taskThree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input INT cost per minute for C1: ");
        int c1 = sc.nextInt();
        System.out.print("Input INT cost per minute for C2: ");
        int c2 = sc.nextInt();
        System.out.print("Input INT cost per minute for C3: ");
        int c3 = sc.nextInt();
        System.out.print("Input INT duration of C1: ");
        int t1 = sc.nextInt();
        System.out.print("Input INT duration of C2: ");
        int t2 = sc.nextInt();
        System.out.print("Input INT duration of C3: ");
        int t3 = sc.nextInt();
        System.out.println("Cost of call 1: " + c1 * t1);
        System.out.println("Cost of call 2: " + c2 * t2);
        System.out.println("Cost of call 3: " + c3 * t3);
        System.out.println("Total: " + (c1 * t1 + c2 * t2 + c3 * t3));
    }

    private static void taskTwo() {
        String name, address;
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Where do you live, " + name + "?");
        address = sc.nextLine();
        System.out.println(name + " lives in: " + address);
    }

    private static void taskOne() {
        System.out.print("Input the radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println("Perimeter: " + 2 * PI * radius);
        System.out.println("Square: " + PI * radius * radius);

    }
}
