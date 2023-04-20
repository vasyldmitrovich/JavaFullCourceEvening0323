package com.softserve.edu11.pt11;

import java.util.Scanner;
public class PracticalTask2 {
    public static void main(String[] args) {
        // Input last name, first name, and middle name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();
        scanner.close();

        // Display last name and initials
        String initials = getInitials(firstName, middleName, lastName);
        System.out.println("Last name and initials: " + lastName + ", " + initials);

        // Display first name
        System.out.println("First name: " + firstName);

        // Display first name, middle name, and last name
        System.out.println("First name, middle name, and last name: " + firstName + ", " + middleName + ", " + lastName);
    }

    public static String getInitials(String firstName, String middleName, String lastName) {
        // Extract first character from first name, middle name, and last name
        String firstInitial = firstName.substring(0, 1);
        String middleInitial = middleName.substring(0, 1);
        String lastInitial = lastName.substring(0, 1);

        // Return concatenate initials
        return firstInitial + middleInitial + lastInitial;
    }
}
