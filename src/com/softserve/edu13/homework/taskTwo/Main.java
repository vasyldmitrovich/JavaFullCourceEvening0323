package com.softserve.edu13.homework.taskTwo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = fullList();
        System.out.println("List = "+employeeList);
        System.out.println("Most popular name = "+mostPopularName(employeeList.stream()).get());
    }

    public static Optional<String> mostPopularName(Stream<Employee> employeeStream){//Good
        Map<String, Long> countByName = employeeStream
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        String key = countByName.entrySet().stream().reduce((count, count2) -> count.getValue() > count2.getValue() ? count : count2).get().getKey();
        if(key == null){
            return Optional.empty();
        }else {
            return Optional.of(key);
        }

    }

    public static List<Employee> fullList(){
        return Arrays.asList(new Employee("Evgen"),
                new Employee("Mark"),
                new Employee("Anton"),
                new Employee("Sanya"),
                new Employee("Anton"),
                new Employee("Maks"),
                new Employee("Evgen"),
                new Employee("Anton")
                );
    }
}
