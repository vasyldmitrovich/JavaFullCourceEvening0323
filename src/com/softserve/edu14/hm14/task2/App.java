package com.softserve.edu14.hm14.task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Bob"),
                new Employee("Sarah"),
                new Employee("Tom"),
                new Employee("Bob"));
        System.out.println(mostPopularName(list.stream()));
    }


    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        if (nameCounts.isEmpty()) {
            return Optional.empty();
        }
        String mostPopularName = Collections.max(nameCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
        return Optional.of(mostPopularName);
    }

}