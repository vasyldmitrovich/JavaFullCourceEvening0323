package com.softserve.edu08.hw;

public class Student extends Person implements Cloneable {

    private int course;

    public Student() {
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

    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        copyOfStudent.fullName = (FullName) copyOfStudent.fullName.clone();
        return copyOfStudent;
    }
}
