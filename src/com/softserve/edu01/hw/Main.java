package com.softserve.edu01.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        rad();
        addr();
        call();
    }

        public static void addr () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Where are you live " + name + " ");
            String addres = sc.nextLine();
            System.out.println("Hello " + name + " your addres is " + addres);

        }

        public static void rad() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter redius: ");
            double a = sc.nextInt();
            System.out.println(2 * a * 3.14);
        }


        public static void call() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter phone call price for c1: ");
            double c1 = sc.nextDouble();
            System.out.println("Enter phone call price for c2: ");
            double c2 = sc.nextDouble();
            System.out.println("Enter phone call price for c3: ");
            double c3 = sc.nextDouble();

            System.out.println("Enter phone call duration for t1: ");
            double t1 = sc.nextDouble();
            System.out.println("Enter phone call duration for t2: ");
            double t2 = sc.nextDouble();
            System.out.println("Enter phone call duration for t3: ");
            double t3 = sc.nextDouble();

            double all = (c1 * t1 + c2 * t2 + c3 * t3);

            System.out.println("Cost for 1 call " + c1 * t1);
            System.out.println("Cost for 2 call " + c2 * t2);
            System.out.println("Cost for 3 call " + c3 * t3);
            System.out.println("Cost for all calls " + all);


        }

    }






