package com.softserve.edu14.hw14.hw2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Bob"),
                new Employee("Sarah"),
                new Employee("Tom"),
                new Employee("Bob"));
        System.out.println(Employee.mostPopularName(list.stream()));
    }
}
