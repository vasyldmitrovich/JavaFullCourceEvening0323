package com.softserve.edu07.hw;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;

    private double monthlySalary;

    public SalariedEmployee() {}

    public SalariedEmployee(String name, String socialSecurityNumber, double monthlySalary) {
        super(name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlySalary = monthlySalary;
        setAverageMonthlySalary(calculatePay());
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
        setAverageMonthlySalary(calculatePay());
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, name: %s, average monthly wage: %.2f",socialSecurityNumber, getName(), monthlySalary);
    }
}
