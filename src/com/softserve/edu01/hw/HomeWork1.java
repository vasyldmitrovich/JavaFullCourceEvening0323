package com.softserve.edu01.hw;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input radius: ");
        double radius = scan.nextDouble();
        final double PI = 3.14F;
        double area = PI * radius * radius;
        System.out.println("Area: " + area);
        double perimeter = 2 * PI * radius;
        System.out.println("Perimeter: " + perimeter);
    }
}
