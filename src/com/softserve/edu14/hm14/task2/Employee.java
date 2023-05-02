package com.softserve.edu14.hm14.task2;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Employee {//All what must be in entity class is fields and methods what have sense for this entity
    private String name;

    //Move getters and setters after constructor, and add spaces between methods
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Employee(String name) { this.name = name; }

    //Methods like this must be in class App.java
    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        if (nameCounts.isEmpty()) {
            return Optional.empty();
        }
        String mostPopularName = Collections.max(nameCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
        return Optional.of(mostPopularName);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
