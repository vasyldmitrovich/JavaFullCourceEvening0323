package com.softserve.edu01.hw;

import java.util.Scanner;

public class App_H_1_1 {
    public static void main(String[] args){

        radius();
        adress();
        phone();

    }

    public static void adress(){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your name -->  ");
        String name = n.nextLine();
        System.out.println("Enter your adress " + name);
        Scanner a = new Scanner(System.in);
        String adress = a.nextLine();
        System.out.println("Hi " + name + " your adress is " + adress);
        System.out.println();
    }

    public static  void radius(){
        float p = 3.14f;
        Scanner radius = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = radius.nextDouble();
        System.out.println("Radius is: " + 2*p*r);
    }

    public static void phone(){
        Scanner duration = new Scanner(System.in);
        System.out.println("Enter duraion of first call --> ");
        double t1 = duration.nextDouble();
        System.out.println("Enter duraion of second call --> ");
        double t2 = duration.nextDouble();
        System.out.println("Enter duraion of third call --> ");
        double t3 = duration.nextDouble();

        System.out.println("Enter cost of minute in third call --> ");
        double c1 = duration.nextDouble();
        System.out.println("Enter cost of minute in third call --> ");
        double c2 = duration.nextDouble();
        System.out.println("Enter cost of minute in third call --> ");
        double c3 = duration.nextDouble();
        System.out.println("Cost of first call --> " + t1*c1);
        System.out.println("Cost of second call --> " + t2*c2);
        System.out.println("Cost of second call --> " + t3*c3);
        double amount  =  t1*c1 + t2*c2 + t3*c3;
        System.out.println("Cost of all calls --> " + amount);
    }

}
