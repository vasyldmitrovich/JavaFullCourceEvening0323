package com.softserve.edu09.hm09.task2;

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public void promoteStudent() {
        if (getAverageGrade() >= 3.0) {
            course++;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Group: " + group + ", Course: " + course + ", Grades: " + grades.toString();
    }
}
