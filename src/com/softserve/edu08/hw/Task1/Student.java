package com.softserve.edu08.hw.Task1;

public class Student extends Person implements Cloneable{
    private int course;

    public Student() {
        super();
    }

    public Student(int course) {
        this.course = course;
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return "Firs name: " + getFullName().getFirstName() +
                ", Last name: " + getFullName().getLastName() +
                ", Age: " + getAge() +
                ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
