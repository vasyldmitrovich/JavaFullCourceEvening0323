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

    public static void main(String[] args) {
        Employee employee1 = new Employee("Sally", 150, 40);
        Employee employee2 = new Employee("Lola", 100, 60);
        Employee employee3 = new Employee("Bob", 140, 30);

        System.out.println("Employee1 information: " + employee1);
        System.out.println("Employee2 information: " + employee2);
        System.out.println("Employee3 information: " + employee3);
        System.out.println();
        Integer totalSalary = employee1.getSalary() + employee2.getSalary() + employee3.getSalary();
        System.out.println("Total salary is: $" + totalSalary);
        System.out.println();
        Double total = totalSalary + employee1.getBonuses() + employee2.getBonuses() + employee3.getBonuses();
        System.out.println("Total salary with bonuses is: $" + total);
        System.out.println("Total employees count is: " + Employee.totalSum);
    }
}
