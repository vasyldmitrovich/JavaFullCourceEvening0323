package com.softserve.edu08.hw.Task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person student1 = new Student(new FullName("Bozhen", "Rusin"), 18, 1);
        Person student2 = new Student(new FullName("Vasil", "Bazhan"), 25, 8);

        Person cloneOfStudent1 = (Student) student1.clone();

        ((Student) cloneOfStudent1).setCourse(5);

        Person[] persons = {student1, student2, cloneOfStudent1};

        for (Person temp : persons){
            System.out.println(temp.activity());
            System.out.println(temp.info());
        }

    }
}
