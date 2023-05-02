package com.softserve.edu10.hw.Task3;

import java.util.ArrayList;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    //Move this method to class Main.java
    public static void printStudents(ArrayList<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public int compareTo(Student student) {
        if (student == null) {
            return -1;
        }
        return Comparator.comparingInt(Student::getCourse)
                .thenComparing(Student::getName)
                .compare(this, student);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}