package com.softserve.edu07.hw07.hw1;

public abstract class Employee {
    private String employed;

    public Employee(String employed) {
        this.employed = employed;
    }

    public String getEmployed() {
        return employed;
    }

    public void setEmployed(String employed) {
        this.employed = employed;
    }
}
