package com.softserve.edu07.hw.Task1;

import java.util.Arrays;
//import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new ContractEmployee("Id1","11-11", 2500);
        Employee employee2 = new ContractEmployee("Id2","22-22", 4900);
        Employee employee3 = new SalariedEmployee("Id3","1234", 4000,96);
        Employee employee4 = new SalariedEmployee("Id4", "1234", 30, 48);
        Employee[] array = {employee1,employee2,employee3,employee4};

//        Arrays.sort(array, Comparator.comparingDouble(Employee::calculatePay).reversed());

        Arrays.sort(array, new Employee.BySalary());

        for (Employee temp : array){
            System.out.println(temp);
        }
    }
}
