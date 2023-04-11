package com.softserve.edu08.homework.taskTwo;

public class Grade {

    private String lesson;

    private double grade;

    public Grade(String lesson, double grade) {
        this.lesson = lesson;
        this.grade = grade;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "lesson='" + lesson + '\'' +
                ", grade=" + grade +
                '}';
    }
}
