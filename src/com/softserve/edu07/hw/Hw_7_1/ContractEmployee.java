package com.softserve.edu07.hw.Hw_7_1;

public class ContractEmployee extends Employee implements Payment{
    private String federalTaxIdmember;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId,String name,String federalTaxIdmember,double hourlyRate,int hoursWorked){
        super(employeeId,name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }




    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
