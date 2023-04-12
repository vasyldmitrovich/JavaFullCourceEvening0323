package com.softserve.edu08.hm08;

public class Main {
    public static void main(String[] args) {
        // Create first student
        FullName fullName1 = new FullName("John", "Doe");
        Student student1 = new Student(fullName1, 20, 101);
        System.out.println("Student 1 Info:");
        student1.info();
        System.out.println("Student 1 Activity: " + student1.activity());

        // Create second student
        FullName fullName2 = new FullName("Jane", "Smith");
        Student student2 = new Student(fullName2, 22, 202);
        System.out.println("\nStudent 2 Info:");
        student2.info();
        System.out.println("Student 2 Activity: " + student2.activity());

        // Clone first student and change course
        Student student3 = null;
        try {
            student3 = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        if (student3 != null) {
            student3.setCourse(303); // Change course for student3
            System.out.println("\nStudent 3 Info (after cloning and changing course):");
            student3.info();
            System.out.println("Student 3 Activity: " + student3.activity());
        }
    }
}