package com.softserve.edu07.pt.Task2;

public class Main {
    public static void main(String[] args) {//Good
        Person cleaner = new Cleaner("Bob");
        Person teacher = new Teacher("Vasil");
        Person student = new Student("Bozhen");

        Person[] array = {cleaner,teacher,student};

        for(Person person : array){
            if (person instanceof Staff){
                person.print();
                ((Staff) person).salary();
            } else {
                person.print();
            }
        }
    }
}
