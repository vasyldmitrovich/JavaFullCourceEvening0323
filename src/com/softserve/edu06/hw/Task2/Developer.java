package com.softserve.edu06.hw.Task2;

public class Developer extends Employee {
    String programmingLanguage;

    public Developer() {

    }

    public Developer(String name, int age, double salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Programming language: %s, " + "" +
                "Salary: ₴ %.2f.", getName(), getAge(), programmingLanguage, getSalary());
    }
}
