package com.softserve.edu08.hw;

public class Student extends Person implements Cloneable{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String info(){
        return "First name:"+ "<"+ getFullName().getFirstName() +">" + "Last name:" + "<" + getFullName().getLastName()+ ">"+
                "Age:" + "<"+ getAge() + ">" + "Course: " + "<" + getCourse() + ">";
    }

    @Override
    public String activity() {
        return "I'm studying at university";
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        return cloned;
    }

}
