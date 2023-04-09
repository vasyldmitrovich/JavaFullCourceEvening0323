package com.softserve.edu07.pt.task2;

public class PersonApp {

    public static void main(String[] args) {
        Person[] persons = {new Cleaner("Bob", 4000),
                new Teacher("Sally", 6000),
                new Student(),
                new Teacher(),
                new Cleaner()};

        for (Person p: persons) {
            p.print();
            if (p instanceof Cleaner || p instanceof Teacher) {
                ((Staff) p).salary();
            }
        }
    }
}
