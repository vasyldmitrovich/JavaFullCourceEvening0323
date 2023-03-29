package com.softserve.edu02.example;

import java.util.Arrays;

public class Student {
    private String name;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static double avrRating(Student... students) {
        return Arrays.stream(students).mapToDouble(Student::getRating).average().getAsDouble();
    }

    public static double totalRating(Student... students) {
        return Arrays.stream(students).mapToDouble(Student::getRating).sum();
    }

    public Student() {
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public boolean betterStudent(Student studentForComparing) {
        return studentForComparing.getRating() > this.getRating() ? true : false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
