package com.softserve.edu03.hw;

public class Person {

    private String firstName;
    private String lastName;
    private Integer birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getAge() {
        final Integer currentYear = 2023;
        return currentYear - this.getBirthYear();
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public void output() {
        System.out.println();
        System.out.println("Person information: ");
        System.out.println("First name is " + getFirstName());
        System.out.println("Last name is " + getLastName());
        System.out.println("Birthday year is " + getBirthYear());
        System.out.println("Age in current year is: " + getAge() + " years");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Olga", "Reva");
        person1.setBirthYear(1984);
        person1.output();

        Person person2 = new Person("Lego", "Kubik");
        person2.setBirthYear(1905);
        person2.output();

        Person person3 = new Person("Bob", "Bib");
        person3.setBirthYear(2009);
        person3.output();

        Person person4 = new Person("Asdf", "Hjkll");
        person4.setBirthYear(2010);
        person4.output();

        Person person5 = new Person("Qwerty", "Oplkj");
        person5.setBirthYear(2002);
        person5.output();
    }
}
