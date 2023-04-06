
package com.softserve.edu04.hw;
import java.util.Scanner;
public class FloatRange{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three floating-point numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        if (num1 >= -5 && num1 <= 5 && num2 >= -5 && num2 <= 5 && num3 >= -5 && num3 <= 5) {
            System.out.println("All three numbers belong to the range [-5, 5].");
        } else {
            System.out.println("At least one number does not belong to the range [-5, 5].");
        }
    }
}

