package com.softserve.edu03.hw.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.inputSides();

        if (!triangle.ifExist()) {
            System.out.println("A triangle like this does not exist");
        } else {
            System.out.println("The area of the triangle is: " + triangle.area());
        }
    }
}

