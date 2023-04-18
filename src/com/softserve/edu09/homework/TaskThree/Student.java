package com.softserve.edu09.homework.TaskThree;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;

    private int courses;

    public Student() {
    }

    public Student(String name, int courses) {
        this.name = name;
        this.courses = courses;
    }

    public Student(String name) {
        this.name = name;
        courses = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }



    public static void printStudents(List<Student> studentList, int courses){
        ListIterator<Student> studentListIterator = studentList.listIterator();
        while (studentListIterator.hasNext()){
            Student student = studentListIterator.next();
            if(student.getCourses() == courses){
                System.out.println("Student with name "+student.getName()+" learn on "+student.getCourses()+" courses");
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return student.getName().equals(this.name) && student.getCourses() == this.courses;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,courses);
    }

    @Override
    public int compareTo(Student student) {
        if(student == null){
            return -1;
        }
        if(student.getCourses() == this.courses && student.getName().equals(this.name)){
            return 0;
        }
        if(this.courses > student.getCourses()){
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
