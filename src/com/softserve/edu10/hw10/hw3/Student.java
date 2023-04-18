package com.softserve.edu10.hw10.hw3;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int course;


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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void printStudents(List<Student> students, int course) {
        Iterator<Student> listIterator = students.listIterator();
        while (listIterator.hasNext()) {
            Student student = listIterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName() + ", course is " + course);
            }

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    public boolean compareByName(Student s1, Student s2) {
        if (s1.getName().equals(s2.getName())) {
            System.out.println("Names are same");
            return true;
        } else System.out.println("Names are different");
        return false;
    }

    public boolean compareByCourse(Student s1, Student s2) {
        if (s1.getCourse() == s2.getCourse()) {
            System.out.println("Course are same");
            return true;
        } else System.out.println("Course are different");
        return false;
    }

    @Override
    public int compareTo(Student st) {
        if (st.getCourse() == this.course && st.getName().equals(this.name)) {
            return 0;
        } else if (st == null) {
            return -1;
        }else if (st.getCourse()<this.course){
            return 1;
        }
        return -1;
    }
}
