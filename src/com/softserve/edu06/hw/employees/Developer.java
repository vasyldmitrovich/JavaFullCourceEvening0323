package com.softserve.edu06.hw.employees;

public class Developer extends Employee {

    private String position;

    public Developer() {
    }

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

    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, " +
                "Salary: \u20B4 %.2f", name, age, position, salary);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
