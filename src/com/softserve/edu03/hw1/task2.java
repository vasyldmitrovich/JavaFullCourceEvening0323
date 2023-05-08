package com.softserve.edu03.hw1;

import java.util.Scanner;

public class task2 {
    static void smallest(double a,double b,double c) {
        double Smal;
        if(a<b&&a<c){
            System.out.println( "The smalest number is"+a);
        } else if (b<a&&b<c) {
            System.out.println( "The smalest number is"+b);
        }
        else {
            System.out.println( "The smalest number is"+c);
        }
    }
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        System.out.println("Input number 1");
        double a = br.nextDouble();
        System.out.println("Input number 2");
        double b = br.nextDouble();
        System.out.println("Input number 3");
        double c = br.nextDouble();
        smallest(a,b,c);






    }
}
