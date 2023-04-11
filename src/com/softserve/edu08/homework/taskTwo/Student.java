package com.softserve.edu08.homework.taskTwo;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;

    private String group;

    private int course;

    private ArrayList<Grade> gradeList = new ArrayList<>();

    public Student() {
    }

    public Student(String name, String group, int course, ArrayList<Grade> gradeList) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradeList = gradeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(ArrayList<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course + "\n"+
                "gradeList=" + gradeList +
                '}'+"\n";
    }
}
