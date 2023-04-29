package com.softserve.edu14.hw14.hw1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = Product.createList();
        System.out.println(list);
        System.out.println(Product.sortedList(list));
    }
}
