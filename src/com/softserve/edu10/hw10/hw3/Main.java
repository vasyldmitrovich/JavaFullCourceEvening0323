package com.softserve.edu10.hw10.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tanya Serbinenko", 1) );
        students.add(new Student("Alina Sushenko", 2) );
        students.add(new Student("Taras Mironenko", 3) );
        students.add(new Student("Nazar Dovbysh", 2) );
        students.add(new Student("Vlad Klimenko", 1) );
        System.out.println("Source list of students");
        System.out.println(students);
        System.out.println();
        Collections.sort(students);
        System.out.println("Sorted list of students");
        System.out.println(students);
    }
}
