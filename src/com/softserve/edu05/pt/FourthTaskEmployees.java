package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;
public class FourthTaskEmployees {
    public static void main(String[] args) {
        Employee[] employees = fillTheArray();
        System.out.println("Unsorted array:");
        for(Employee emp : employees){
            System.out.println(emp);
        }

        Arrays.sort(employees);
        System.out.println("Sorted array:");
        for(Employee emp : employees){
            System.out.println(emp);
        }

    }

    static Employee[] fillTheArray(){
        System.out.print("Input amount of workers: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Employee[] array = new Employee[size];
        String name;
        int depNumber;
        double salary;
        for(int i = 0; i < array.length; i++){
            System.out.println("Adding worker #" + (i + 1) + ": ");
            System.out.print("\tName: ");
            name = sc.next();
            System.out.print("\tDepartment number: ");
            depNumber = sc.nextInt();
            System.out.print("\tSalary: ");
            salary = sc.nextDouble();
            array[i] = new Employee(name, depNumber, salary);
        }
        return array;
    }
}
