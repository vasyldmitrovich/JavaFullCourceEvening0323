package com.softserve.edu07.hw07.task1;

public class Employee {
    //Add for fields access modifier private
    String employeeId;
    String socialSecurityNumber;
    String name;

    public Employee(String employeeId, String socialSecurityNumber, String name) {
        this.employeeId = employeeId;
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
    }

    public double calculatePay() {
        return 0;
    }
}