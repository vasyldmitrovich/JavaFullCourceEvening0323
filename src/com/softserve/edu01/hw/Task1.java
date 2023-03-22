package com.softserve.edu01.hw;

import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius:");
        int rad = Integer.parseInt(scanner.nextLine());
        System.out.println("Circle`s perimeter: " + (2*rad * PI) + "\n" + "Circle`s area: " + (PI*pow(rad,2)));
    }
}
