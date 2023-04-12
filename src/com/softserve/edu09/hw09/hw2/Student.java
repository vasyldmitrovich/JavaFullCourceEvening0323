package com.softserve.edu09.hw09.hw2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private List<Integer> grades = new ArrayList<>();

    private double averageGrade;

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public Student(String name, int group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

}


//    Create a collection that holds all objects. Write a methods that:
//        o removes students with a grade point average of less than 3. If a student's average score is 3 or higher, then they will be automatically promoted to the next course level.
//        o printStudents(List<Student> students, int course) which takes a list of students and a course number as inputs. This method should print out the names of the students who are enrolled in the specified course number to the console.
//        • In main() method create collection and output result.
