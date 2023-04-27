package com.softserve.edu13.homework.taskOne;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = getFullList();
        System.out.println("Obtain a sorted by the price list of products belong to category Phone with\n" +
                "price > 3000, and the date of manufacture was more then 1 year ago.");
        System.out.println(productList.stream()
                .filter(product -> product.getCategory().equals(Category.PHONE))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDate().getYear() > 1)
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .collect(Collectors.toList())
        );
    }

    // I full only five because i was very laziness
    public static List<Product> getFullList(){
        List<Product> list = Arrays.asList(new Product("Tomate",Category.DRINKS, new Date(System.currentTimeMillis()-1000000),1400),
                new Product("Iphone 11 pro max", Category.PHONE,new Date(System.currentTimeMillis()-199000000000L),3600),
                new Product("Samsung s8",Category.PHONE,new Date(System.currentTimeMillis()-499000000000L),3100),
                new Product("Banana",Category.FOOD,new Date(System.currentTimeMillis()-499000000000L),800),
                new Product("Xiomi",Category.PHONE,new Date(System.currentTimeMillis()-4990000),1500)
                );
        return list;
    }
}
