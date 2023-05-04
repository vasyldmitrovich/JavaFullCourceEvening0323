package com.softserve.edu06.homework.taskOne;

public class SalariedEmployee extends Employee implements Payment {
    private double hourPay;
    private int countHours;
    private String socialSecurityNumber;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String employeeId, String name, double hourPay, int countHours, String socialSecurityNumber) {
        super(employeeId, name);
        this.hourPay = hourPay;
        this.countHours = countHours;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SalariedEmployee(String employeeId, String name, int countHours, String socialSecurityNumber) {
        super(employeeId, name);
        hourPay = 5.6;
        this.countHours = countHours;
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

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return hourPay * countHours;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name = "+getName()+
                "employee id = "+getEmployeeId()+
                "salary = "+calculatePay()+'\n'+
                "socialSecurityNumber= " + socialSecurityNumber + '}';
    }
}
