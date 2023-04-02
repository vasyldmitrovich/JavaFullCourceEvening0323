package com.softserve.edu03.hw;

import java.util.Scanner;
public class TriangleAreaCalculator {
    /*This is bad decision use many static variable, you can use variable like this in main method*/
    public static void main(String[] args) {
        double s, area;

        /*For Scanner use some method, in this method you send message like parameter
         * this method print this message, take data from user and return this data*/

        //Added a method to get triangle's sides values
        //changed an access modifier and moved variables into main method
        double  a = getSideValue("Input side 1:");
        double b = getSideValue("Input side 2:");
        double c = getSideValue("Input side 3:");

        double maxValue = getMaxValue(a,b,c);
        if (a +b + c - maxValue > maxValue){
            s = (a + b + c) / 2;
            area = Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)) * 100) / 100d;
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("It is impossible to build a triangle");
        }

    }

    static double getSideValue(String message){
        Scanner sc = new Scanner(System.in);
        System.out.print(message + " ");
        return sc.nextDouble();
    }

    static double getMaxValue(double a, double b, double c){
        double maxValue = a;
        if (b > maxValue){
            maxValue = b;
        }
        if (c > maxValue){
            maxValue = c;
        }
        return maxValue;
    }
}
