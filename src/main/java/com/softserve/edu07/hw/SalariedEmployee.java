package com.softserve.edu07.hw;

public class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
    double saleOfMonth;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, double saleOfMonth) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.saleOfMonth = saleOfMonth;
    }

    @Override
    public double calculatePay() {
        return saleOfMonth;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getSaleOfMonth() {
        return saleOfMonth;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", saleOfMonth=" + saleOfMonth +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
