package com.softserve.edu8.hw;

public class FullName {
    private static String firstName;
    private static String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void SetFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static String GetFirstName() {
        return firstName;
    }

    public void SetlastName(String lastName) {
        this.lastName = lastName;
    }

    public static String GetlastName() {
        return lastName;
    }
}
abstract  class Person {
    private String fullName;
    private FullName f1;
    private static int age;

    public Person(FullName f1, int age) {
        this.f1 = f1;
        this.age = age;
    }
    public static int Getage() {
        return age;
    }
    public String info() {
        return String.format("Ім'я: %s, Прізвище: %s, Вік: %d",
             f1.GetFirstName(),f1.GetlastName(),age);
    }
        public abstract String activity ();

}

