package com.softserve.edu07.hw07;

public class HourlyEmployee extends ContractEmployee{
    public HourlyEmployee(String employeeId, double hourlyRate, double hoursWorked) {
        super(employeeId, hourlyRate, hoursWorked);
    }

    @Override
    public double calculatePay() {
        double overtimePay = 0;
        if (hoursWorked > 40) {
            overtimePay = (hoursWorked - 40) * hourlyRate * 1.5;
            hoursWorked = 40;
        }
        return (hourlyRate * hoursWorked) + overtimePay;
    }
}
