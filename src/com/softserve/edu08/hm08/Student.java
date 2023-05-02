package com.softserve.edu08.hm08;

public class Student extends Person implements Cloneable{
    int numberCourse;

    // Constructor with parameters to initialize all fields
    public Student(FullName fullName, int age, int numberCourse) {
        super(fullName, age);
        this.numberCourse = numberCourse;
    }

    // Override info() method to include course information
    @Override
    public void info(){
        System.out.println("Name: " + getFullName().getFirstName() + " " + getFullName().getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + numberCourse);
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public Student clone() {
        return (Student) super.clone();
    }
}
