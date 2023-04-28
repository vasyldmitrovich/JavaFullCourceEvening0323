package com.softserve.edu08.hw;

public class Student extends Person implements Cloneable{
    private int course;

    public Student(){
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + String.format(" Course: %d", course);
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        FullName copyOfFullName = (FullName) getFullName().clone();
        Student copyOfStudent = (Student) super.clone();
        copyOfStudent.setFullName(copyOfFullName);
        return copyOfStudent;
    }
}
