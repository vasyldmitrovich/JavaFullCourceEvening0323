package com.softserve.edu07.hw.Task1;

public class ContractEmployee extends Employee implements Payment{
    private double fixedPayment;
    private String federalTaxIdMember;

    public ContractEmployee(){
    }
    public ContractEmployee(String employeeId, String federalTaxIdMember, double fixedPayment) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedPayment = fixedPayment;
    }

    public double getFixedPayment() {
        return fixedPayment;
    }

    public void setFixedPayment(double fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }


    @Override
    public String toString() {
        return "ContractEmployee{" +
                "employeeId='" + getEmployeeId() +
                ", federalTaxIdMember='" + federalTaxIdMember +
                ", fixed salary=" + fixedPayment + '\'' +
                '}';
    }

    @Override
    public double calculatePay() {
        return fixedPayment;
    }
}
