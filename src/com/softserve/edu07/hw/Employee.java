package com.softserve.edu07.hw;

abstract class Employee {
    private String employeeld;
    double monthlySalary;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }
    public double calculatePay() {
        return monthlySalary;
    }

    public String getEmployeeld() {
        return employeeld;
    }
}
