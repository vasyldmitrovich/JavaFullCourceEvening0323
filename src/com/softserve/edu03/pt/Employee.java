package com.softserve.edu03.pt;

public class Employee {

    private String name;
    private Integer rate;
    private Integer hours;
    public static Integer totalSum = 0;

    public Employee() {
        totalSum++;
    }

    public Employee(String name) {
        this.name = name;
        this.rate = 100;
        this.hours = 40;
        totalSum++;
    }

    public Employee(String name, Integer rate, Integer hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getSalary() {
        return this.getHours() * this.getRate();
    }

    public Double getBonuses() {
        return Double.valueOf((getSalary() * 10)/100);
    }

    @Override
    public String toString() {
        return "Employee [" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours + "]";
    }
}
