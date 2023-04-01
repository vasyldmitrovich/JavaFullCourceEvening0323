package com.softserve.edu06.hm06;

public class Developer extends Employee{
    private final String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s, Salary: ₴ %.2f",
                getName(), getAge(), position, getSalary());
    }
}
