package com.softserve.edu10.hm10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.softserve.edu10.hm10.Student;

import static com.softserve.edu10.hm10.Student.compareByCourse;

public class HomeWork03 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 1));
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 3));
        students.add(new Student("David", 2));

        // Display list of students sorted by name
        System.out.println("Students sorted by name:");
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.getName() + " - Course: " + student.getCourse());
        }

        // Display list of students sorted by course
        System.out.println("\nStudents sorted by course:");
        students.sort(compareByCourse);
        for (Student student : students) {
            System.out.println(student.getName() + " - Course: " + student.getCourse());
        }

        // Print students enrolled in course 2
        System.out.println("\nStudents enrolled in course 2:");
        Student studentObj = new Student("", 0);
        studentObj.printStudents(students, 2);

    }

}
