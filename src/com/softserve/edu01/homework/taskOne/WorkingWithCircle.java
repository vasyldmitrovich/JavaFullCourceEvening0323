package com.softserve.edu01.homework.taskOne;

import java.util.Scanner;

public class WorkingWithCircle {
    private Scanner scanner = new Scanner(System.in);

    public void startWorking() {
        System.out.println("Choose operation:\n1)Found perimeter\n2)Found area");
        int chooseOperation = scanner.nextInt();
        switch (chooseOperation) {
            case 1 -> System.out.println("Perimeter circle = " + foundAndOutputPerimeter(getRadiusCircleFromConsole()));
            case 2 -> System.out.println("Area circle = " + foundAndOutputArea(getRadiusCircleFromConsole()));
            default -> throw new RuntimeException("Error after choose operation!");
        }
    }

    private double getRadiusCircleFromConsole() {
        System.out.println("Input please radius for circle:");
        return scanner.nextDouble();
    }

    public double foundAndOutputPerimeter(double radius) {
        return (2 * 3.14 * radius);
    }

    public double foundAndOutputArea(double radius) {
        return (3.14 * (radius * radius));
    }
}
