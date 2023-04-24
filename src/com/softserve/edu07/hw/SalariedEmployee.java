package com.softserve.edu07.hw;

public class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
    double monthlySalary;

    public SalariedEmployee(String employeeld, String socialSecurityNumber, double monthlySalary) {
        super(employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}
