package com.softserve.edu10.hm10;

import java.util.*;

class Student implements Comparable<Student> {
    private final String name;
    private final int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    //Move this method in class where is main method
    public void printStudents(List<Student> students, int courseNumber) {
        System.out.println("Students enrolled in course " + courseNumber + ":");
        for (Student student : students) {
            if (student.getCourse() == courseNumber) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    //This variable is good
    public static Comparator<Student> compareByCourse = Comparator.comparingInt(student -> student.course);

    //Move this main method to class like App.java
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
