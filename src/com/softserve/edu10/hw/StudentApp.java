package com.softserve.edu10.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentApp {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Olga", 5));
        students.add(new Student("Vera", 4));
        students.add(new Student("Kolya", 3));
        students.add(new Student("Polya", 2));
        students.add(new Student("Dasha", 1));
        students.add(new Student("Masha", 5));
        students.add(new Student("Maria", 1));
        students.add(new Student("Elena", 4));
        students.add(new Student("Denis", 2));
        students.add(new Student("Alex", 4));

        printStudents(students, 4);

        Collections.sort(students, new NameComparator());
        printStudents("Sorted by name: \n", students);

        Collections.sort(students, new CourseComparator());
        printStudents("Sorted by course: \n", students);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.printf("Students are on %d course:\n", course);
        for (Student student: students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    public static void printStudents(String outputMessage, List<Student> students) {
        System.out.printf(outputMessage);
        for (Student student: students) {
            System.out.println(student);
        }
    }
}
