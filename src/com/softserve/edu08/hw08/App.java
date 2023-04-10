package com.softserve.edu08.hw08;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Tanya", "Serbinenko"), 27, 2);
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println();
        Student student2 = (Student) student1.clone();

        student2.setCourseNum(1);
        System.out.println(student2.info());
        System.out.println(student2.activity());
    }
}
