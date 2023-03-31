package com.softserve.edu01.pt;

import java.util.Scanner;

public class Pt_1_3 {

    public static void main(String[] args) {
        numbers();
    }




        public static void numbers() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            double a = sc.nextDouble();
            System.out.println("Enter b: ");
            double b = sc.nextDouble();
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
        }
    }

