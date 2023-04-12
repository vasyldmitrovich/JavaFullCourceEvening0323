package com.softserve.edu09.hw09.hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tanya Serbinenko", 2, 1, new ArrayList<>(Arrays.asList(3, 7, 9, 5, 10))));
        students.add(new Student("Roman Sidorenko", 3, 2, new ArrayList<>(Arrays.asList(3, 2, 2, 3, 3))));
        students.add(new Student("Julia Barannik", 1, 1, new ArrayList<>(Arrays.asList(1, 1, 1, 2, 3))));
        students.add(new Student("Stas Sidorenko", 3, 2, new ArrayList<>(Arrays.asList(3, 7, 9, 11, 11))));
        students.add(new Student("Tanya Gulivez", 1, 1, new ArrayList<>(Arrays.asList(4, 5, 6, 3, 2))));
        StudentService studentService = new StudentService();
        System.out.println("Students which average grade more than 3 upper their course");
        System.out.println(studentService.removeByGrade(students));
        System.out.println();
        System.out.println("Input number of course that you'd like to see");
        int numOfCourse = sc.nextInt();
        System.out.println(studentService.printByCourse(students, numOfCourse));

    }
}


