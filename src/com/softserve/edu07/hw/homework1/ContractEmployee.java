package com.softserve.edu07.hw.homework1;

public class ContractEmployee extends Employee implements Payment {

    private int hourlyRate;
    private int hoursWorked;
    private String federalTaxIdMember;

    public ContractEmployee() {
    }

    public ContractEmployee(String employeeId, String name, int hourlyRate, int hoursWorked, String federalTaxIdMember) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public int calculatePay() {
        return hourlyRate * hoursWorked;
    }

    public void print() {
        System.out.println("Employee: name=" + this.getName() +
                ", id=" + this.getEmployeeId() + ", salary= " + calculatePay());
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                super.toString() + ", " +
                "hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                ", federalTaxIdMember='" + federalTaxIdMember + '\'' +
                '}';
    }
}
