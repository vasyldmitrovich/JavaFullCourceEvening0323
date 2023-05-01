package com.softserve.edu07.pt.Pt_7_2;

public class Pt_7_2 {
    public static void main(String[] args) {
        //Create some method which return array of Person
        Person[] people = new Person[5];
        people[0] = new Teacher("John");
        people[1] = new Teacher("Mary");
        people[2] = new Cleaner("Bob");
        people[3] = new Cleaner("Alice");
        people[4] = new Student("Tom");

        for (Person person : people) {
            person.print();
        }

        for (Person person : people) {
            if (person instanceof Teacher) {
                ((Teacher) person).salary();
            } else if (person instanceof Cleaner) {
                ((Cleaner) person).salary();
            }
        }
    }
}
