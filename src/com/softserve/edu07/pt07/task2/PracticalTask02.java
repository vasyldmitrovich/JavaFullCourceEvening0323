package com.softserve.edu07.pt07.task2;

public class PracticalTask02 {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Teacher("John");
        people[1] = new Teacher("Sarah");
        people[2] = new Cleaner("Dave");
        people[3] = new Cleaner("Karen");
        people[4] = new Student("Bob");

        for (Person person : people) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}
