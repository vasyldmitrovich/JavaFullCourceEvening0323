package com.softserve.apps;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dollar cost --> ");
        double DolarCost = sc.nextDouble();
        System.out.println("Enter how mutch gryvnas you have --> ");
        double GryvnaAmount = sc.nextDouble();

        System.out.println("You can buy  " + BuyDollar(DolarCost,GryvnaAmount) + "$");
        System.out.println("You will have "+ ChangeDollar(DolarCost)+" gryvnas");
    }

    public static double BuyDollar(double DollarCost, double GryvnaAmount){
        double dollars = GryvnaAmount / DollarCost;
        return dollars;
    }

    public static double ChangeDollar(double DollarCost){
        double gryvnas = DollarCost * DollarCost;
        return gryvnas;
    }
    public static void print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dollar cost --> ");
        double DolarCost = sc.nextDouble();
        System.out.println("Enter how mutch gryvnas you have --> ");
        double GryvnaAmount = sc.nextDouble();

        System.out.println("You can buy  " + BuyDollar(DolarCost,GryvnaAmount) + "$");
        System.out.println("You will have "+ ChangeDollar(DolarCost)+" gryvnas");
    }
}

