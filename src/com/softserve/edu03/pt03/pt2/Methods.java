package com.softserve.edu03.pt03.pt2;


public class Methods {

    public static int getSalary(Employee employee) {
        return employee.getHours() * employee.getRate();
    }

    public static void toString(Employee employee) {
        System.out.println("Name: " + employee.getName() + " Rate: " + employee.getRate() + " Hours: " + employee.getHours());
    }
    public static double getBonuses(Employee employee) {
        return getSalary(employee) * (0.1);
    }
}
