package com.softserve.edu10.pt10;

class Employee {
    //Do not make fields private
    private final String name;
    private final String position;
    private final double salary;
    private final String dob;

    public Employee(String name, String position, double salary, String dob) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dob = dob;
    }

    public String toString() {
        return name + " (" + position + ", $" + salary + "/year, DOB: " + dob + ")";
    }
}