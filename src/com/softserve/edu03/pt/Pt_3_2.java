package com.softserve.edu03.pt;

public class Pt_3_2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Max", 500, 8);
        Employee emp2 = new Employee("Ivan", 550, 9);
        Employee emp3 = new Employee("Yaroslav", 450, 7);

        emp1.getSalary();
        emp1.output();
        emp1.Bonus();

        emp2.getSalary();
        emp2.output();
        emp2.Bonus();

        emp3.getSalary();
        emp3.output();
        emp3.Bonus();
        System.out.println("Total Salary is: "+(emp1.getSalary()+emp2.getSalary()+emp3.getSalary()));
    }
}

