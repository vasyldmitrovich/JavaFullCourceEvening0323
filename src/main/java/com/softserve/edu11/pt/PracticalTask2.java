package com.softserve.edu11.pt;

import java.util.Scanner;

public class PracticalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your middle name: ");
        String middleName = scanner.nextLine();

        System.out.println(lastName + " " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
        System.out.println(firstName);
        System.out.println(firstName + " " + middleName + " " + lastName);
    }
}
