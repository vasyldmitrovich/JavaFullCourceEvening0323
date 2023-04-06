package com.softserve.edu07.homework;

public class Student extends Person{
    private int numberCourses;

    public Student(FullName fullName, int age) {
        super(fullName, age);
        numberCourses = 1;
    }

    public Student(FullName fullName, int age, int numberCourses) {
        super(fullName, age);
        this.numberCourses = numberCourses;
    }

    public int getNumberCourses() {
        return numberCourses;
    }

    public void setNumberCourses(int numberCourses) {
        this.numberCourses = numberCourses;
    }

    @Override
    public String info() {
        return "First name:"+super.getFullName().getFirstName()
                +", Last name: "+super.getFullName().getLastName()
                +", Age: " +super.getAge()
                +", Number courses: "+numberCourses;
    }

    @Override
    public String activity() {
        return "I am student in softserve academy";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        FullName fullNameForCopy = new FullName(getFullName().getFirstName(), getFullName().getLastName());
        Student studentForClone = new Student(fullNameForCopy,getAge(),this.numberCourses);
        return studentForClone;
    }
}
