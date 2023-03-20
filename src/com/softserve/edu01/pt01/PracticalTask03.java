package com.softserve.edu01.pt01;

import java.util.Scanner;

/*
Define integer variable a and b. Read values a and b from Console and calculate:
a+b
a-b
a*b
a/b
 */
public class PracticalTask03 {
    public static void main(String[] args) {
        // create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // read values of a and b from the console
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();
        scanner.close();

        // perform arithmetic operations
        int sum = a + b;
        int difference = a - b;
        int product  = a * b;
        int quotient  = a / b;

        // print results
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + product);
        System.out.println("a / b = " + quotient);
    }

}
