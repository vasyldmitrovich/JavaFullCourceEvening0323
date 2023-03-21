package edu01;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius");
        int radius = sc.nextInt();
        int perimeter = (int) (2*radius*Math.PI);
        System.out.println("Perimeter is: "+perimeter);
        int area = (int) (Math.pow(radius,2)*Math.PI);
        System.out.println("Area is: "+area);
    }
}
