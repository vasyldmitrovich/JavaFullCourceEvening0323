package com.softserve.edu03.hw1;




import java.util.Scanner;

public class Task1 {

    double area(double a,double b,double c) {
        double p=(a+b+c)/2;
        double Area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return  Area;
    }

    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        System.out.println("Input side 1");
        int a = br.nextInt();
        System.out.println("Input side 2");
        int b = br.nextInt();
        System.out.println("Input side 3");
        int c = br.nextInt();
        Task1 obj=new Task1();
        double areal =obj.area(a,b,c);
        System.out.println("The area of triangle is: "+areal);


    }
}