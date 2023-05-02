package com.softserve.edu07.homework;

public class Main {
    public static void main(String[] args) {//Good
        Student studentOne = new Student(new FullName("Evgen","Brexyn"),21,2);
        Student studentTwo = new Student(new FullName("Mark","Amosov"),25);
        System.out.println(studentOne.info());
        System.out.println(studentTwo.info());
        System.out.println(studentOne.activity());
        System.out.println(studentTwo.activity());
        Student studentAfterClone = null;
        try{
            studentAfterClone = (Student) studentOne.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        studentAfterClone.setNumberCourses(4);
        System.out.println("After clone!");
        System.out.println(studentOne.info());
        System.out.println(studentAfterClone.info());
    }
}
