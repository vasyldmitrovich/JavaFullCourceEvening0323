package com.softserve.edu09.hw;

import java.util.*;
import java.util.stream.Collectors;

public class HomeWork2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Alex", "Java Fundamental", 1, List.of(4.0, 4.0, 4.0));
        Student student2 = new Student("Dima", "Java Fundamental", 1, List.of(5.0, 5.0, 5.0));
        Student student3 = new Student("Oleg", "Java Fundamental", 1, List.of(2.0, 2.0, 2.0));
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(Arrays.toString(students.toArray()));

        List<Student> result = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getAverageGrades() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
                result.add(student);
                System.out.println("Student " + student.getName() + " has grade " + student.getAverageGrades() + " and transferred to the course number " + student.getCourse() + ".");
            }
        }
    }
}
