package com.softserve.edu07.hw;

public class ContractEmployee extends Employee implements Payment {
    String federalTaxIdmember;
    double hourlyRate;
    double hoursWorked;

    public ContractEmployee(String employeeId, double hourlyRate, double hoursWorked) {
        super(employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        double monthlySalary = hourlyRate * hoursWorked;
        return monthlySalary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
