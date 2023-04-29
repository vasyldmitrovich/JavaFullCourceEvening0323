package com.softserve.edu10.hw.Task3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Bozhen", 1));
        students.add(new Student("Evgenia", 2));
        students.add(new Student("Oleksandr", 3));
        students.add(new Student("Nazar", 3));
        students.add(new Student("Tania", 1));

        Collections.sort(students);
        System.out.println(students);
        System.out.println("\nStudents on 2 course");
        Student.printStudents(students, 1);

    }
}
