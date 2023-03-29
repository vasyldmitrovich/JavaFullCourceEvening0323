package com.softserve.edu03.hw03.hw3;

import java.util.Scanner;
public class Methods {
    private static final int currentYear = 2023;

    public static int getAge(Person person) {
        return currentYear - person.getBirthYear();
    }

    public static void output(Person person) {
        System.out.println("Name: " + person.getFirstName() + " LastName: " + person.getLastName() + " Year of birth: " + person.getBirthYear());
    }

    public static void changeName(Person person, String ln) {
        person.setFirstName(ln);
        output(person);
    }
    public static Person input(Person person) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter first name");
        person.setFirstName(sc.nextLine());
        System.out.println("Please, enter last name");
        person.setLastName(sc.nextLine());
        System.out.println("Please, enter year of birth");
        person.setBirthYear(sc.nextInt());
        return person;
    }
}
