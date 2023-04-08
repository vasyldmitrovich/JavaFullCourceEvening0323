package com.softserve.edu07.pt07.pt2;

public class App {
    public static void main(String[] args) {
        Person persons [] = new Person[3];
        persons [0] = new Cleaner();
        persons [1] = new Teacher();
        persons [2] = new Student();
        System.out.println();
        persons [0].print();
        ((Cleaner)persons[0]).salary();
        System.out.println();
        persons [1].print();
        ((Teacher)persons[1]).salary();
        System.out.println();
        persons[2].print();

    }
}
