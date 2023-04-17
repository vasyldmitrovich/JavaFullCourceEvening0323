package com.softserve.edu09.hw.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Bozhen1", 309, 3, new ArrayList<>(List.of(2,2,2,2,2,2,2))));
        students.add(new Student("Bozhen2", 309, 3, new ArrayList<>(List.of(3,3,3,3,3,3,3))));
        students.add(new Student("Bozhen3", 309, 3, new ArrayList<>(List.of(5,5,5,5,5,5,5))));
        students.add(new Student("Bozhen4", 309, 2, new ArrayList<>(List.of(9,4,4,4,4,4,4))));
        System.out.println(students);
        System.out.println("---------------------------------------------");
        Student.removeStudentOrNextCourse(students);
        System.out.println(students);
        System.out.println("---------------------------------------------");
        int course = 3;
//        Scanner scanner = new Scanner(System.in);
//        int course = scanner.nextInt();
        Student.printStudents(students, course);
    }
}
