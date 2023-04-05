package com.softserve.edu07.hw07;

public class SalariedEmployee extends Employee implements Payment{
    private final double salary;

    public SalariedEmployee(String employeeId, double salary, int socialSecurityNumber) {
        super(employeeId);
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}
