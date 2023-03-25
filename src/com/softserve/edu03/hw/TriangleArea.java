package com.softserve.edu03.hw;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Double side1 = getSide(1);
        Double side2 = getSide(2);
        Double side3 = getSide(3);
        System.out.println("The area of the triangle is: " + getTriangleArea(side1, side2, side3));
    }

    public static Double getSide(int sideNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input side " + sideNumber + ": ");
        return Double.valueOf(scanner.nextLine());
    }

    public static Double getTriangleArea(Double a, Double b, Double c) {
        Double p = (a + b + c)/2;
        Double temp = (p - a)*(p - b)*(p - c)*p;
        return Math.sqrt(temp);
    }
}
