package com.softserve.edu09.hw.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student() {

    }

    public Student(String name, int group, int course, ArrayList<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
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

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
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

    //This and next method must be in Main.java, because those methods are not related to the essence of the student
    public static void removeStudentOrNextCourse(ArrayList<Student> student) {
        double average;
        Student current;
        Iterator<Student> iterator = student.iterator();
        while (iterator.hasNext()){
            average = 0;
            current = iterator.next();
            for (int j = 0; j < current.getGrades().size(); j++) {
                average += current.getGrades().get(j);
            }
            average = average / current.getGrades().size();
            if (average < 3) {
                iterator.remove();
            } else {
                current.setCourse(current.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course){
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getCourse() == course){
                System.out.println(students.get(i));
            }
        }
    }
}
