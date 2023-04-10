package com.softserve.edu05.pt;

import com.softserve.edu05.hw.Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AppP_5_4 {
    public static void main(String[] args) {
        Employee emp[] = new Employee[5];
        emp[0] = new Employee("Sam", 3, 1850);
        emp[1] = new Employee("Ivan", 1, 2800);
        emp[2] = new Employee("Max", 5, 1760);
        emp[3] = new Employee("Tom", 1, 2200);
        emp[4] = new Employee("Peter", 3, 2400);


        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter department number --> ");
        int num = sc.nextInt();

        System.out.println("We have this employees in this department ");
        for(int i = 0; i< emp.length; i++){
            if(num == emp[i].getDepartmentNumber()){
                System.out.println(emp[i].getName()+" "+emp[i].getSalary());
            }
        }

        System.out.println("Sorted by Salary");

        Arrays.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                if (employee1.getSalary() > employee2.getSalary()) {
                    return -1;
                } else if (employee1.getSalary() < employee2.getSalary()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i< emp.length; i++) {
            System.out.println(emp[i].getName() + " - " + emp[i].getSalary());
        }


    }
}
