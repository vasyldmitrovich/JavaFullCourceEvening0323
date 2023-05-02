package com.softserve.edu08.homework.taskTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Student> arrayListStudent = fullArrayForTask();
        arrayListStudent.forEach(System.out::print);
        System.out.println("");
        System.out.println("Check grades for students");
        arrayListStudent = checkGradesStudents(arrayListStudent);
        arrayListStudent.forEach(System.out::print);
        System.out.println("");
        System.out.println("Task with show students for courses");
        System.out.println("Input please courses from 1 to 5");
        int numberCoursesFromUser = scanner.nextInt();
        printStudents(arrayListStudent,numberCoursesFromUser);
    }

    private static <T> void printStudents(List<? extends Student> students, int course){//Pleasurably see that you use extends Student
        students.stream().filter(student -> student.getCourse() == course).forEach(student -> System.out.println("Student "+student.getName()+", learn on "+course+" courses"));
    }

    private static ArrayList<Student> checkGradesStudents(ArrayList<Student> arrayListStudent){
        return arrayListStudent.stream().filter((student -> student.getGradeList().stream().mapToDouble(Grade::getGrade).average().getAsDouble() > 3))
                .peek(student -> student.setCourse(student.getCourse()+1))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private static ArrayList<Student> fullArrayForTask(){
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Bob","B24",2,new ArrayList<>(Arrays.asList(new Grade("english",4.5), new Grade("mathematics", 3.9), new Grade("biology",4.2), new Grade("chemistry",4.4)))));
        arrayList.add(new Student("Evgen","A2",3,new ArrayList<>(Arrays.asList(new Grade("english",4.1), new Grade("mathematics", 4.9), new Grade("biology",2.8), new Grade("chemistry",3.5)))));
        arrayList.add(new Student("Anton","Q21",1,new ArrayList<>(Arrays.asList(new Grade("english",2.5), new Grade("mathematics", 1.9), new Grade("biology",2.2), new Grade("chemistry",2.4)))));
        arrayList.add(new Student("Vova","C2",3,new ArrayList<>(Arrays.asList(new Grade("english",4.0), new Grade("mathematics", 4.1), new Grade("biology",4.5), new Grade("chemistry",4.8)))));
        return arrayList;
    }
}
