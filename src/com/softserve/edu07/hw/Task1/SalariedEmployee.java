package com.softserve.edu07.hw.Task1;

public class SalariedEmployee extends Employee implements Payment{

    private String socialSecurityNumber;
    private double hourPay;
    private int countHours;

    public SalariedEmployee(){
    }
    public SalariedEmployee(String employeeId, String socialSecurityNumber, double hourPay, int countHours) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourPay = hourPay;
        this.countHours = countHours;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getHourPay() {
        return hourPay;
    }

    public void setHourPay(double hourPay) {
        this.hourPay = hourPay;
    }

    public int getCountHours() {
        return countHours;
    }

    public void setCountHours(int countHours) {
        this.countHours = countHours;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employeeId='" + getEmployeeId() +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", hourPay=" + hourPay +
                ", countHours=" + countHours +
                ", salary=" + calculatePay() +
                '}';
    }

    @Override
    public double calculatePay() {
        return hourPay * countHours;
    }
}
