package com.softserve.edu03.hm03;

public class HomeWork03 {
    public static void main(String[] args) {
        //Create five objects of Person type and input time information about them to console.
        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
            System.out.printf("Enter information for person %d:%n", i + 1);
            people[i].input();
        }

        System.out.println("Information about the people: ");

        for (Person person : people) {
            person.output();
        }
        
    }
}
