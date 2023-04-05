package com.softserve.edu01.hw;

import java.util.Scanner;



public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = getNumber("Enter the first number: ", scanner);
        int num2 = getNumber("Enter the second number: ", scanner);
        int num3 = getNumber("Enter the second number: ", scanner);
        System.out.println(getArea(num1,num2,num3));
    }
    public static int getNumber(String prompt, Scanner scanner) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            scanner.next();
        }
        return scanner.nextInt();
    }
public  static double getArea(double num1, double num2, double num3){
        double perimeter= (num1+num2+num3)/2;
    double resultMp=perimeter*(perimeter - num1)*(perimeter - num2)*(perimeter - num3);
double area= Math.sqrt(resultMp);
return area;
    }
}
