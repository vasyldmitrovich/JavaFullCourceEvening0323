package com.softserve.edu10.hw;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

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

    public void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static Comparator<Student> nameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getName().compareTo(student2.getName());
        }
    };

    public static Comparator<Student> courseComparator = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getCourse() - student2.getCourse();
        }
    };
}
