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


    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public static Comparator<Student> compareByCourse = Comparator.comparingInt(student -> student.course);

    public void printStudents(List<Student> students, int courseNumber) {
        System.out.println("Students enrolled in course " + courseNumber + ":");
        for (Student student : students) {
            if (student.getCourse() == courseNumber) {
                System.out.println(student.getName());
            }
        }
    }

}
