package com.softserve.edu07.pt;

public class PracticalTask2 {
    public static void main(String[] args) {
        Person persons[] = new Person[4];
        persons[0] = new Teacher("Jed Brown", 2000);
        persons[1] = new Cleaner("Natalia", 500);
        persons[2] = new Student("Vitaliy");
        persons[3] = new Student("Dima");

        for (Person person : persons) {
            person.print();
        }

        for (Person person : persons) {
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}
