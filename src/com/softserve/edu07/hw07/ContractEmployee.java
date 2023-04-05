package com.softserve.edu07.hw07;

public class ContractEmployee extends Employee implements Payment{
    protected final double hourlyRate;
    protected double hoursWorked;
    protected int federalTaxIdMember;

    public ContractEmployee(String employeeId, double hourlyRate, double hoursWorked) {
        super(employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
