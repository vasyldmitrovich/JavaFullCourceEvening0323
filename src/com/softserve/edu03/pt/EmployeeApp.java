package com.softserve.edu03.pt;

public class EmployeeApp {

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
