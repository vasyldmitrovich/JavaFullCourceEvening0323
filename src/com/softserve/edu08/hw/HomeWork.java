package com.softserve.edu08.hw;

public class HomeWork {
    public static void main(String[] args) throws CloneNotSupportedException {
        FullName fullName1 = new FullName("Dima", "Andrusiv");
        Student student1 = new Student(fullName1, 36, 1);
        FullName fullName2 = new FullName("Sasha", "Orlov");
        Student student2 = new Student(fullName2, 35, 2);
        System.out.println(student1.info());
        System.out.println(student2.info());
        System.out.println(student1.activity());
        System.out.println(student2.activity());
        Student student3 = student1.clone();
        student3.setCourse(10);
        System.out.println(" ");
        System.out.println(student1.info());
        System.out.println(student3.info());
    }
}
