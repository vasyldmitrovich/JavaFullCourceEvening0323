package com.softserve.edu07.hw07.hw1;

public class ContractEmployee extends Employee implements Payment {

    private String federalSecurityNumber;
    private int salary;

    private int fixPayment;

    private String name = super.getEmployed();


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFederalSecurityNumber() {
        return federalSecurityNumber;
    }

    public void setFederalSecurityNumber(String federalSecurityNumber) {
        this.federalSecurityNumber = federalSecurityNumber;
    }

    public int getFixPayment() {
        return fixPayment;
    }

    public void setFixPayment(int fixPayment) {
        this.fixPayment = fixPayment;
    }

    public ContractEmployee(String federalSecurityNumber, int fixPayment, String employed) {
        super(employed);
        this.federalSecurityNumber = federalSecurityNumber;
        this.fixPayment = fixPayment;
        this.salary = fixPayment;
    }

    @Override
    public int calculatePay() {
        return fixPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalSecurityNumber='" + federalSecurityNumber + '\'' +
                ", salary=" + fixPayment +
                ", name='" + name;
    }
}
