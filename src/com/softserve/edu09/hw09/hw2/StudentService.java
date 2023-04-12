package com.softserve.edu09.hw09.hw2;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public List<Student> removeByGrade(List<Student> students) {
        List<Student> sortedList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            students.get(i).setAverageGrade(getAverageOfGrade(students.get(i).getGrades()));
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() < 3) {
                sortedList.add(students.get(i));
            }
        }
        students.removeAll(sortedList);
        for (int i = 0; i < students.size(); i++) {
            students.get(i).setCourse(students.get(i).getCourse() + 1);
        }
        return students;
    }

    public double getAverageOfGrade(List<Integer> grade) {
        double avg = 0;
        for (int i = 0; i < grade.size(); i++) {
            avg = (avg + grade.get(i));
        }
        return avg / grade.size();
    }

    public List<Student> printByCourse(List<Student> students, int course) {
        List<Student> sortedList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course) {
                sortedList.add(students.get(i));
            }
        }
        return sortedList;
    }
}
