package com.softserve.edu05.pt05.pt4;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> listOfEmp = new ArrayList<>();
        listOfEmp.add(new Employee("Eduard", 3, 2000));
        listOfEmp.add(new Employee("Marko", 4, 2060));
        listOfEmp.add(new Employee("Sofi", 1, 3000));
        listOfEmp.add(new Employee("Mari", 4, 2400));
        listOfEmp.add(new Employee("Nick", 2, 2900));
        System.out.println(listOfEmp);

        System.out.println(sameDepartment(10, listOfEmp));
        List<Employee> listOfEmpSorted = listOfEmp;
        listOfEmpSorted = listOfEmp.stream().sorted(Collections.reverseOrder(Comparator.
                comparing(m -> m.getSalary()))).collect(Collectors.toList());
        System.out.println(listOfEmpSorted);
    }

    public static List<Employee> sameDepartment(int department, List<Employee> employeeList) {
        List<Employee> listOfEmp = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (department == employeeList.get(i).getDepartmentNumber()) {
                listOfEmp.add(employeeList.get(i));
            }
        }
        return listOfEmp;
    }

}
