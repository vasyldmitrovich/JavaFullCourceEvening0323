package edu03.homework3;

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
}
