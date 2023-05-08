package com.softserve.edu11.pt;

import java.util.Scanner;

public class NamesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Please, input first string: ");
        String firstName = scanner.nextLine();
        System.out.println("Please, input middle string: ");
        String middleName = scanner.nextLine();

        System.out.println(String.format("Last name and initials: %s %s.%s.",
                lastName, firstName.substring(0, 1).toUpperCase(), middleName.substring(0, 1).toUpperCase()));
        System.out.println(String.format("First name: %s ", firstName));
        System.out.println(String.format("First name, middle name and last name: %s %s %s", firstName, middleName, lastName));
    }
}
