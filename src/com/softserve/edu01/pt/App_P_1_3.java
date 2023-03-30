package com.softserve.edu01.pt;

import java.util.Scanner;

public class App_P_1_3 {
    public static void main(String[] args){
        numbers();
    }


    public static void numbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number -->  ");
        double a = sc.nextDouble();
        System.out.println("Enter second number -->  ");
        double b = sc.nextDouble();
        System.out.println("a + b  ---> " + (a + b));
        System.out.println("a - b  ---> " + (a - b));
        System.out.println("a * b  ---> " + (a * b));
        System.out.println("a / b  ---> " + (a / b));
    }


}

