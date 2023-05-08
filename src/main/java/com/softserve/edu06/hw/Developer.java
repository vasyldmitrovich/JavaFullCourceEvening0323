package com.softserve.edu06.hw;

public class Developer extends Employee {
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public String report() {
        return "Name: " + getName() + ", Age: " + getAge() + ", Salary: " + getSalary() + ".";
    }
}
