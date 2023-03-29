package com.softserve.edu03.hw03.hw3;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1 = Methods.input(person1);
        Person person2 = new Person();
        person2 = Methods.input(person1);
        Person person3 = new Person();
        person3 = Methods.input(person1);
        Person person4 = new Person();
        person4 = Methods.input(person1);
        Person person5 = new Person();
        person5 = Methods.input(person1);
        person1.setBirthYear(1958);
        System.out.println(Methods.getAge(person1));
        person3.setBirthYear(1814);
        Methods.output(person3);
        Methods.changeName(person2, "Tetiana");
    }
}
