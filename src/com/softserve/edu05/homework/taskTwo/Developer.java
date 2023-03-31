package com.softserve.edu05.homework.taskTwo;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
        position = "Junior Java Developer";
    }

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return "Name: " + getSalary() + ", Age: " + getAge() + ", Position: " + position + ", Salary: " + getSalary();
    }
}
