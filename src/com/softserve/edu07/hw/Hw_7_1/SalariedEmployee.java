package com.softserve.edu07.hw.Hw_7_1;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private double monthlyPayment;

    public SalariedEmployee(String employeeId,String name,String socialSecurityNumber,double monthlyPayment) {
        super(employeeId,name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlyPayment = monthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public double getMonthlyPayment(){
        return monthlyPayment;
    }



    @Override
    public double calculatePay() {
        return monthlyPayment;
    }
}
