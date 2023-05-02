package com.softserve.edu07.hw07.task1;

public class Employee {
    private String employeeId;
    private String socialSecurityNumber;
    private String name;

    public Employee(String employeeId, String socialSecurityNumber, String name) {
        this.employeeId = employeeId;
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculatePay() {
        return 0;
    }
}