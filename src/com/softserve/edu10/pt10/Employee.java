package com.softserve.edu10.pt10;

class Employee {
    //Do not make fields private
    final String name;
    final String position;
    final double salary;
    final String dob;

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