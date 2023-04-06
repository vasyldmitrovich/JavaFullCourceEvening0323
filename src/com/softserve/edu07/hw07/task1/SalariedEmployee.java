package com.softserve.edu07.hw07.task1;

public class SalariedEmployee extends Employee implements Payment {

double hourlyRate;
    int hoursWorked;

    public SalariedEmployee(String employeeId, double hourlyRate, int hoursWorked, String socialSecurityNumber, String name) {
        super(employeeId, socialSecurityNumber, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}