package com.softserve.edu03.hm03;

import java.util.Scanner;

public class Area {
    static final String OUTLINE = "The area of the triangle is ";
    static final String INPUTSIDE = "Input side ";

    //Method to calculate the area of a triangle.
    public void calculateArea (){

        Scanner scannerSide = new Scanner(System.in);

        //Entering the size of 1 sides
        System.out.print(INPUTSIDE + "1: ");
        double a = scannerSide.nextDouble();

        //Entering the size of 2 sides
        System.out.print(INPUTSIDE + "2: ");
        double b = scannerSide.nextDouble();

        //Entering the size of 3 sides
        System.out.print(INPUTSIDE + "3: ");
        double c = scannerSide.nextDouble();

        scannerSide.close();

        double s = (a+b+c)/2; //Heron's formula (calculation of the semi-perimeter)

        double A = Math.sqrt(s*(s-a)*(s-b)*(s-c)); //calculation of the area of a triangle using three side lengths

        System.out.println(OUTLINE + A);
    }
}
