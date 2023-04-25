package com.softserve.edu07.hw;

public class ContractEmployee extends Employee implements Payment{
    private String federalTaxIdMember;
    private double hourlyRate;
    private int hours;

    public ContractEmployee() {}

    public ContractEmployee(String name, String federalTaxIdMember, double hourlyRate, int hours) {
        super(name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
        setAverageMonthlySalary(calculatePay());
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hours;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, name: %s, average monthly wage: %.2f",federalTaxIdMember, getName(), getAverageMonthlySalary());
    }
}
