package com.softserve.edu03.pt;

import java.util.Scanner;

public class Pt_3_1 {
    public static void main(String[] args){
    calc();
    }


    public static void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
        System.out.println("The average of "+a+" and "+b+" is "+((a+b)/2) );
    }

}