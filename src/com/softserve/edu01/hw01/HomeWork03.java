package edu01.hw;

import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost per minute for call 1: ");
        double c1 = scanner.nextDouble();
        System.out.print("Enter the duration of call 1 (in minutes): ");
        double t1 = scanner.nextDouble();

        System.out.print("Enter the cost per minute for call 2: ");
        double c2 = scanner.nextDouble();
        System.out.print("Enter the duration of call 2 (in minutes): ");
        double t2 = scanner.nextDouble();

        System.out.print("Enter the cost per minute for call 3: ");
        double c3 = scanner.nextDouble();
        System.out.print("Enter the duration of call 3 (in minutes): ");
        double t3 = scanner.nextDouble();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double totalCost = cost1 + cost2 + cost3;

        System.out.println("Cost of call 1: " + cost1);
        System.out.println("Cost of call 2: " + cost2);
        System.out.println("Cost of call 3: " + cost3);
        System.out.println("Total cost: " + totalCost);
    }
}
