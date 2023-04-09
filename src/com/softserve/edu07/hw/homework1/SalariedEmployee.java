package com.softserve.edu07.hw.homework1;

public class SalariedEmployee extends Employee implements Payment {

    private int fixedSalary;
    private String socialSecurityNumber;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String employeeId, String name, int fixedSalary, String socialSecurityNumber) {
        super(employeeId, name);
        this.fixedSalary = fixedSalary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return fixedSalary;
    }

    public void print() {
        System.out.println("Employee: name=" + this.getName() +
                ", id=" + this.getEmployeeId() + ", salary= " + calculatePay());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                super.toString() + ", " +
                "fixedSalary=" + fixedSalary +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
