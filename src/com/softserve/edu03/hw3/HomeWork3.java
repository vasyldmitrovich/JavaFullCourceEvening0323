package com.softserve.edu03.hw3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Person person1 = new Person("Alex", "O");
        person1.setBirthYear(1988);
        Person person2 = new Person("Dima", "A");
        person2.setBirthYear(1987);
        Person person3 = new Person("Vitaliy", "y");
        person3.setBirthYear(1986);
        Person person4 = new Person("Oleg", "F");
        person4.setBirthYear(1990);
        Person person5 = new Person("Yriy", "M");
        person5.setBirthYear(1995);
        int person1Age = person1.getAge();
        System.out.println(person1.getFirstName() + " your age is " + person1Age + ".");
        System.out.println(person1.input());
        System.out.println(person1.output());
        person1.changeName("Chris", "Martin");
        System.out.println(person1.output());
    }
}
