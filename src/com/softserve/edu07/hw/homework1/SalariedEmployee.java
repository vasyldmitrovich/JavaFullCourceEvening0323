package com.softserve.edu07.hw.homework1;

public class SalariedEmployee extends Employee implements Payment {

    private int salaryAmount;
    private String socialSecurityNumber;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String employeeId, String name, int salaryAmount, String socialSecurityNumber) {
        super(employeeId, name);
        this.salaryAmount = salaryAmount;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return salaryAmount;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salaryAmount=" + salaryAmount +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
