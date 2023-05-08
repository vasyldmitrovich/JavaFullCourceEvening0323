/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu10.hw;

import java.util.List;

/**
 *
 * @author rgonchar
 */
public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
    
    public static void printStudents(List<Student> list, int course){
        System.out.println("List of students on course " + course + ":");
        for (Student s : list){
            if(s.getCourse()==course){
                System.out.println(s.getName());
            }
        }
    }
    
    public static boolean compareByName(Student s1, Student s2){
        System.out.println(s1.getName() + " equals " + s2.getName());
        return s1.getName().equals(s2.getName());
    }
    
    public static boolean compareByCourse(Student s1, Student s2){
        System.out.println(s1.getCourse() + "==" + s2.getCourse());
        return s1.getCourse()==s2.getCourse();
    }
    
    
    
}
