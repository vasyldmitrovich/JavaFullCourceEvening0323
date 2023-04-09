package com.softserve.edu07.pt.task2;

public abstract class Staff extends Person {

    protected int salary;

    public Staff() {
    }

    public Staff(String name) {
        super(name);
    }

    public Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void salary();

    @Override
    public String toString() {
        return "Staff{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
