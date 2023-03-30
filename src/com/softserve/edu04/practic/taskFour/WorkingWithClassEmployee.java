package com.softserve.edu04.practic.taskFour;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WorkingWithClassEmployee {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employeeOne = new Employee("Dima", 2, 7400);
        Employee employeeTwo = new Employee("Artur", 5, 6000);
        Employee employeeThree = new Employee("Nik", 1, 8000);
        Employee employeeFour = new Employee("Eugen", 2, 9000);
        Employee employeeFive = new Employee("Anton", 3, 7900);
        System.out.println("Process found department");
        System.out.print("Input number department: ");
        int numberDepartmentFromUser = scanner.nextInt();
        List<Employee> employeeListAfterFilter = foundEmployeeForDepartment(numberDepartmentFromUser,employeeOne, employeeTwo, employeeThree, employeeFour, employeeFive);
        System.out.println(employeeListAfterFilter.size() != 0 ? employeeListAfterFilter : "Not found employees for it is department");
        System.out.println("Process sorted");
        Employee[] afterSorted = sortEmployeesWithSalaryDesc(employeeOne, employeeTwo, employeeThree, employeeFour, employeeFive);
        for(Employee employee : afterSorted){
            System.out.print(employee+" ");
        }
    }

    public static List<Employee> foundEmployeeForDepartment(int numberDepartmentFromUser,Employee... employees) {
        return Arrays.stream(employees).filter(employee -> employee.getDepartment_number() == numberDepartmentFromUser)
                .collect(Collectors.toList());
    }

    public static Employee[] sortEmployeesWithSalaryDesc(Employee... employees) {
        return Arrays.stream(employees).sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toArray(Employee[]::new);
    }
}
