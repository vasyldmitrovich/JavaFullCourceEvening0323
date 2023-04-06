package com.softserve.edu07.hw07.task1;

public class ContractEmployee extends Employee implements Payment{
    double fixedSalary;

    public ContractEmployee(String employeeId, double fixedSalary, String socialSecurityNumber, String name) {
        super(employeeId, socialSecurityNumber, name);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculatePay() {
        return fixedSalary;
    }
}