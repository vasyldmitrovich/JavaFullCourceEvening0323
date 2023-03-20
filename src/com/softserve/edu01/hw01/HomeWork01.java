package com.softserve.edu01.hw01;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {

        //task01
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double perimeter = Area.calculatePerimeter(radius);
        double area = Area.calculateArea(radius);

        System.out.println("Perimeter of the circle: " + perimeter);
        System.out.println("Area of the circle: " + area);

    }

}