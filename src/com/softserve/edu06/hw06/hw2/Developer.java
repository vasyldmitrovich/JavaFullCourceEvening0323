package com.softserve.edu06.hw06.hw2;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String report() {

        return String.format("Name: %s, Age: %d, Position: %s, " + "Salary: \u20B4 %.2f.", getName(), getAge(), position, getSalary());
    }
}
