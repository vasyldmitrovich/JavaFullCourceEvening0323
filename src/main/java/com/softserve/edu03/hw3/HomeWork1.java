package com.softserve.edu03.hw3;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Triangle triangle = new Triangle();
        Scanner scanSide = new Scanner(System.in);
        System.out.print("Enter first side: ");
        double s1 = scanSide.nextDouble();
        System.out.print("Enter second side: ");
        double s2 = scanSide.nextDouble();
        System.out.print("Enter third side: ");
        double s3 = scanSide.nextDouble();
        double triangleResult = triangle.areaTriangle(s1, s2, s3);
        System.out.println(triangleResult);
    }
}
