package com.softserve.edu07.hw;

public abstract class Employee {
    //Make field private
    String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                '}';
    }

    public abstract double calculatePay();

    public String getEmployeeId() {
        return employeeId;
    }
}
