package com.softserve.edu07.hw07.hw1;

public class SalariedEmployee extends Employee implements Payment {

    private int payPerHour;
    private int amountOfHours;
    private String socialSecurityNumber;
    private int salary;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public SalariedEmployee(String employed, int payPerHour, int amountOfHours, String socialSecurityNumber) {
        super(employed);
        this.payPerHour = payPerHour;
        this.amountOfHours = amountOfHours;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(int payPerHour) {
        this.payPerHour = payPerHour;
    }

    public int getAmountOfHours() {
        return amountOfHours;
    }

    public void setAmountOfHours(int amountOfHours) {
        this.amountOfHours = amountOfHours;
    }

    @Override
    public int calculatePay() {
        setSalary(payPerHour * amountOfHours);
        return payPerHour * amountOfHours;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
