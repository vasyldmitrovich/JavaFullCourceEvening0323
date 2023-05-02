package com.softserve.edu09.hm09.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void removeUnderperformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {//Ok
        // Create a collection to hold all objects
        List<Student> studentList = new ArrayList<>();

        // Create sample students
        List<Integer> grades1 = new ArrayList<>();
        grades1.add(4);
        grades1.add(3);
        grades1.add(2);
        Student student1 = new Student("John", "GroupA", 1, grades1);

        List<Integer> grades2 = new ArrayList<>();
        grades2.add(3);
        grades2.add(4);
        grades2.add(4);
        Student student2 = new Student("Alice", "GroupB", 2, grades2);

        List<Integer> grades3 = new ArrayList<>();
        grades3.add(3);
        grades3.add(3);
        grades3.add(3);
        Student student3 = new Student("Bob", "GroupA", 3, grades3);

        // Add students to the collection
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        // Remove under performing students
        removeUnderperformingStudents(studentList);

        // Promote students to next course level
        for (Student student : studentList) {
            student.promoteStudent();//Nice to see that there you use this method :-)
        }

        // Print students enrolled in a specific course
        int courseToPrint = 2;
        System.out.println("Students enrolled in Course " + courseToPrint + ":");
        printStudents(studentList, courseToPrint);
    }
}
