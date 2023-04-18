package com.softserve.edu09.homework.TaskThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Evgen",3));
        listStudent.add(new Student("Mark",4));
        listStudent.add(new Student("Vova",1));
        listStudent.add(new Student("Nikita",2));
        listStudent.add(new Student("Sanya",5));
        Collections.sort(listStudent);
        System.out.println(listStudent);
    }
}
