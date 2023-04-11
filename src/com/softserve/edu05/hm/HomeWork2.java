package com.softserve.edu05.hm;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int num1, num2, sum;
                String answer;

                do {
                    System.out.print("Enter first number: ");
                    num1 = input.nextInt();

                    System.out.print("Enter second number: ");
                    num2 = input.nextInt();

                    sum = num1 + num2;
                    System.out.println("Sum is " + sum);

                    System.out.print("Do you want to perform the operation again? (y/n): ");
                    answer = input.next();

                } while (answer.equalsIgnoreCase("y"));

                System.out.println("Program has ended.");
            }
        }

