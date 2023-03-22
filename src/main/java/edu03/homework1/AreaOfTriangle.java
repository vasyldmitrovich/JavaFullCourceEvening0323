package edu03.homework1;

import edu03.homework3.Main;

import java.util.Scanner;


public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter side1");
        int side1 = scanner.nextInt();
        System.out.println("Please, enter side2");
        int side2 = scanner.nextInt();
        System.out.println("Please, enter side3");
        int side3 = scanner.nextInt();
        System.out.println("Area of your triangle: " + areaOfTriangle(side1, side2, side3));
    }

    private static double areaOfTriangle(int side1, int side2, int side3) {
        double halfOfPerimetr = (side1 + side2 + side3) * 0.5;
        return Math.sqrt((halfOfPerimetr * (halfOfPerimetr - side1) * (halfOfPerimetr - side2) * (halfOfPerimetr - side3)));
    }
}
