package com.softserve.edu08.hw;


public class Student extends Person implements Cloneable  {
    private int course;

    public Student(FullName fullName,int age,int course){
        super(fullName,age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info(){
        return super.info()+", Course: "+course;
    }


    @Override
    public String activity() {
        return "Studying";
    }


    @Override
    public Student clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        return cloned;
    }


}
