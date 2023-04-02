package com.softserve.edu03.pt;

public class EmployeeInfo {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Homer Simpson");
        Employee emp3 = new Employee("Alan Jackson", 166, 15.0);

        emp1.setName("Petro Incognito");
        emp1.setHours(45);
        emp1.setRate(7.50);

        emp2.setHours(120);
        emp2.setRate(10.45);

        System.out.println(emp1);// toString() not needed
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println("Total salary: " + Employee.totalSum);

    }
}

