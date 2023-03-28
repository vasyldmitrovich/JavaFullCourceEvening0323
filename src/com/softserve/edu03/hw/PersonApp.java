package com.softserve.edu03.hw;

public class PersonApp {

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
