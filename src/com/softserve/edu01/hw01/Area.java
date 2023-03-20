package com.softserve.edu01.hw01;

public class Area {


    //method of calculating the perimeter of a circle using the radius.
    public static double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }


    //method of calculating the area of a circle using the radius.
    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
