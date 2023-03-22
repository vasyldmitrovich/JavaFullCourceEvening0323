package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cost per minute for all three counties!");
        int tar1 = Integer.parseInt(scanner.nextLine());
        int tar2 = Integer.parseInt(scanner.nextLine());
        int tar3 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter call`s duration!");
        int dur1, dur2, dur3;
        dur1 = Integer.parseInt(scanner.nextLine());
        dur2 = Integer.parseInt(scanner.nextLine());
        dur3 = Integer.parseInt(scanner.nextLine());
        int cost1, cost2, cost3;
        System.out.println("Cost of first call: " + (tar1 * dur1) + "\n" +
                "Cost of second call: " + (tar2 * dur2) + "\n" +
                "Cost of third call: " + (tar3 * dur3) + "\n" +
                "Total cost: " + (dur1 * tar1 + dur2 * tar2 + dur3 * tar3));

    }
}
