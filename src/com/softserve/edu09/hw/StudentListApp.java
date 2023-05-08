package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;

public class StudentListApp {

    public static void main(String[] args) {
        //Move all this student to some method and there call this method witch return List<Student>
        Student student1 = new Student("Olga", "PZ-02-2", 4, 4.9);
        Student student2 = new Student("Katya", "PZ-02-2", 4, 1.9);
        Student student3 = new Student("Maria", "PZ-02-1", 3, 3.9);
        Student student4 = new Student("Ivan", "PZ-02-3", 2, 4.5);
        Student student5 = new Student("Misha", "PZ-02-2", 1, 2.9);
        Student student6 = new Student("Masha", "PZ-02-1", 1, 3.1);
        Student student7 = new Student("Nata", "PZ-02-3", 1, 4.1);
        Student student8 = new Student("Dima", "PZ-02-1", 2, 5.0);
        List<Student> students = new ArrayList<>(
                List.of(student1, student2, student3, student4, student5, student6, student7, student8));

        List<Student> notGoodStudent = getNotGoodStudents(students);
        students.removeAll(notGoodStudent);
        promoteToNextCourseLevel(students);

        //Nice decision separate logic to methods. Very well
        printStudents(students, 1);
        printStudents(students, 2);
        printStudents(students, 3);
        printStudents(students, 4);
        printStudents(students, 5);

    }

    //Good decision
    public static List<Student> getNotGoodStudents(List<Student> students) {
        List<Student> notGoodStudents = new ArrayList<>();
        for(Student stud: students) {
            if (stud.getGrades() < 3) {
                notGoodStudents.add(stud);
            }
        }
        return notGoodStudents;
    }

    public static void promoteToNextCourseLevel(List<Student> students) {
        for (Student stud: students) {
            stud.setCourse(stud.getCourse() + 1);
        }
    }

    public static void printStudents(List<Student> students, int course) {
        List<Student> studentsOnCourse = getStudentsByCourse(students, course);
        if (studentsOnCourse.isEmpty()) {
            System.out.println("There is no students on course " + course);
        } else {
            System.out.println("List of Students on course " + course);
            for (Student stud: studentsOnCourse) {
                System.out.println("Student: name = " + stud.getName() + ", course = " + stud.getCourse());
            }
        }
    }

    public static List<Student> getStudentsByCourse(List<Student> students, int course) {
        List<Student> studentsByCourse = new ArrayList<>();
        for(Student stud: students) {
            if (stud.getCourse() == course) {
                studentsByCourse.add(stud);
            }
        }
        return studentsByCourse;
    }
}
