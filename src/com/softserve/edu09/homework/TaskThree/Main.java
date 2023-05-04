package com.softserve.edu09.homework.TaskThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

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

    public static void printStudents(List<Student> studentList, int courses){
        ListIterator<Student> studentListIterator = studentList.listIterator();
        while (studentListIterator.hasNext()){
            Student student = studentListIterator.next();
            if(student.getCourses() == courses){
                System.out.println("Student with name "+student.getName()+" learn on "+student.getCourses()+" courses");
            }
        }
    }
}
