package com.softserve.edu07.hw;

public class ContractEmployee extends Employee implements Payment{
    String federalTaxId;
    double hourlyRate;
    double hoursWorked;


    public ContractEmployee(String employeeld, String federalTaxId, double hourlyRate, double hoursWorked) {
        super(employeeld);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
