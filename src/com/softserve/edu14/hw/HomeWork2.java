package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWork2 {
    public static void main(String[] args) {
        Employee empl1 = new Employee("Bob");
        Employee empl2 = new Employee("Din");
        Employee empl3 = new Employee("Sam");
        Employee empl4 = new Employee("Sam");

        //Method getMostPopular should be in this class not in Employee class
        Optional<String> resultMostPopularName = Employee.getMostPopularName(Stream.of(empl1, empl2, empl3, empl4));
        System.out.println(resultMostPopularName);
    }
}
