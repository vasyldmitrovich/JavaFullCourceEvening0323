package com.softserve.edu08.hw08;

public class Student extends Person implements Cloneable {
    private int courseNum;

    public Student(FullName fullName, int age, int courseNum) {
        super(fullName, age);
        this.courseNum = courseNum;
    }

    public Student() {
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    @Override
    public String activity() {
        return "I'm studying at university";
    }

    public String info() {
        return super.info() + ", Course number= " + courseNum;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        copyOfStudent.fullName = (FullName) copyOfStudent.fullName.clone();
        return copyOfStudent;
    }
}
