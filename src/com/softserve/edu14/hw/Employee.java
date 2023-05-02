package com.softserve.edu14.hw;

import javax.lang.model.util.Elements;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    //Make field private
    String name;

    public Employee(String name) {
        this.name = name;
    }

    //Move this method to class HomeWork2.java
    public static Optional<String> getMostPopularName(Stream<Employee> stream) {
        Map<String, Long> counts = stream.collect(Collectors.groupingBy(e -> e.name, Collectors.counting()));
        if (counts.isEmpty()) {
            return Optional.empty();
        }
        return counts.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
    }

    //And this method move too
    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
