package com.softserve.edu10.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.softserve.edu10.hw.Student.courseComparator;
import static com.softserve.edu10.hw.Student.nameComparator;

public class HomeWork3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 1));
        students.add(new Student("Dima", 2));
        students.add(new Student("Vitaliy", 3));
        students.add(new Student("Oleg", 4));
        students.add(new Student("Vasiliy", 5));

        System.out.println("Sorted by name: ");
        Collections.sort(students, nameComparator);
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getCourse());
        }

        System.out.println();
        System.out.println("Sorted by course: ");
        Collections.sort(students, courseComparator);
        for (Student student : students) {
            System.out.println(student.getName() + " ~ " + student.getCourse());
        }
    }
}
