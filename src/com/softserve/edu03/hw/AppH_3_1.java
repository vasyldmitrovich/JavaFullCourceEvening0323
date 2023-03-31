package com.softserve.edu03.hw;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AppH_3_1 {
    public static void main(String[] args){
        TriangleArea();
    }
    public static void TriangleArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 side --->  ");
        double a = sc.nextDouble();
        System.out.println("Enter 2 side --->  ");
        double b  = sc.nextDouble();
        System.out.println("Enter 3 side --->  ");
        double c = sc.nextDouble();

        double p = (a+b+c)/2;
        double result = sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Your area is --->  "+ result);

    }
}
