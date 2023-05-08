package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HomeWork1 {
    public static void main(String[] args) {
        //Create some method which return List<Product>
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", "Phone", LocalDate.of(2020, 5, 20), 50000));
        products.add(new Product("Apple", "Notebook", LocalDate.of(2020, 5, 20), 80000));
        products.add(new Product("Apple", "Tablet", LocalDate.of(2020, 5, 20), 30000));
        products.add(new Product("Samsung", "Phone", LocalDate.of(2019, 2, 10), 30000));
        products.add(new Product("Samsung", "Notebook", LocalDate.of(2019, 2, 10), 25000));
        products.add(new Product("Samsung", "Tablet", LocalDate.of(2019, 2, 10), 15000));
        products.add(new Product("Samsung", "Tv", LocalDate.of(2019, 2, 10), 40000));
        products.add(new Product("Google", "Phone", LocalDate.of(2021, 8, 15), 32000));
        products.add(new Product("Google", "Notebook", LocalDate.of(2021, 8, 15), 30000));
        products.add(new Product("Google", "Tablet", LocalDate.of(2021, 8, 15), 20000));
        products.add(new Product("Xiaomi", "Phone", LocalDate.of(2020, 9, 1), 12000));
        products.add(new Product("Xiaomi", "Notebook", LocalDate.of(2020, 9, 1), 18000));
        products.add(new Product("Xiaomi", "Tablet", LocalDate.of(2020, 9, 1), 10000));
        products.add(new Product("Xiaomi", "Tv", LocalDate.of(2020, 9, 1), 14000));
        products.add(new Product("Lg", "Phone", LocalDate.of(2018, 4, 25), 24000));
        products.add(new Product("Lg", "Notebook", LocalDate.of(2018, 4, 25), 25000));
        products.add(new Product("Lg", "Tablet", LocalDate.of(2018, 4, 25), 12000));
        products.add(new Product("Lg", "Tv", LocalDate.of(2018, 4, 25), 40000));
        products.add(new Product("Dell", "Notebook", LocalDate.of(2021, 12, 12), 30000));
        products.add(new Product("Lenovo", "Notebook", LocalDate.of(2020, 10, 15), 19000));

        //Good
        List<Product> filteredPhoneList = products.stream()
                .filter(p -> p.getCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println(filteredPhoneList);
    }
}
