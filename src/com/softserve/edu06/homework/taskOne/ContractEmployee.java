package com.softserve.edu06.homework.taskOne;

public class ContractEmployee extends Employee implements Payment {
    private double fixedSalaryInMonth;
    private String federalTaxIdMember;

    public ContractEmployee() {
    }

    public ContractEmployee(String employeeId, String name, double fixedSalaryInMonth, String federalTaxIdMember) {
        super(employeeId, name);
        this.fixedSalaryInMonth = fixedSalaryInMonth;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember) {
        super(employeeId, name);
        fixedSalaryInMonth = 12_000;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getFixedSalaryInMonth() {
        return fixedSalaryInMonth;
    }

    public void setFixedSalaryInMonth(double fixedSalaryInMonth) {
        this.fixedSalaryInMonth = fixedSalaryInMonth;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return fixedSalaryInMonth;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "name = "+getName()+
                "employee id = "+getEmployeeId()+
                "salary = "+calculatePay()+'\n'+
                "federalTaxIdMember = " + federalTaxIdMember + '}';
    }
}
