package com.softserve.edu08.hw;

public class FirstTaskStudents {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Nark", "Dacascos"), 21, 4);
        System.out.println(student1.info());
        System.out.println(student1.activity());

        Student student2 = new Student(new FullName("John", "Wick"), 19, 2);
        System.out.println(student2.info());
        System.out.println(student2.activity());

        try {
            Student student3 = (Student) student2.clone();
            student3.setFullName(new FullName("Petro", "Incognito"));
            System.out.println(student3.info());
            System.out.println(student3.activity());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
