package com.softserve.edu04.hw.Task1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        System.out.println(num1 >= -5 && num1 <= 5 ? num2 >= -5 && num2 <= 5 ? num3 >= -5 && num3 <= 5 ?
                "all in range" : "some nums not in range" : "some nums not in range" : "some nums not in range");
    }
}
