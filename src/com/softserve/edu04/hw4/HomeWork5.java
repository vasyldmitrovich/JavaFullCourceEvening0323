package com.softserve.edu04.hw4;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Jack", Breed.JACK_RUSSELL.getName(), 3);
        Dog dog2 = new Dog("Rikki", Breed.CORGI.getName(), 5);
        Dog dog3 = new Dog("Max", Breed.DACHSHUND.getName(), 2);
        System.out.println(dog3.toString());
        if (dog1.getName().equals(dog2.getName())) {
            System.out.println(Breed.JACK_RUSSELL.getName() + " and " + Breed.CORGI.getName() + " have the same names.");
            return;
        } else if (dog2.getName().equals(dog3.getName())) {
            System.out.println(Breed.CORGI.getName() + " and " + Breed.DACHSHUND.getName() + " have the same names.");
            return;
        } else if (dog1.getName().equals(dog3.getName())) {
            System.out.println(Breed.JACK_RUSSELL.getName() + " and " + Breed.DACHSHUND.getName() + " have the same names.");
            return;
        }
        System.out.println("The names are different.");
        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            System.out.println(Breed.JACK_RUSSELL.getName() + " - " + "'" + dog1.getName() + "'" + " is oldest.");
        } else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
            System.out.println(Breed.CORGI.getName() + " - " + "'" + dog2.getName() + "'" + " is oldest.");
        } else if (dog3.getAge() > dog1.getAge() && dog3.getAge() > dog2.getAge()) {
            System.out.println(Breed.DACHSHUND.getName() + " - " + "'" + dog3.getName() + "'" + " is oldest.");
        }
    }
}
