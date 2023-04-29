package com.softserve.edu14.hw14.hw1;

import java.util.*;
import java.util.stream.Collectors;

public class Product {
    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                ", price=" + price +
                ", dateOfManufacture=" + dateOfManufacture +
                '}';
    }

    private Category category;
    private int price;

    private int dateOfManufacture;


    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(Category category, int price, int dateOfManufacture) {
        this.category = category;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public static List<Product> createList() {
        List<Product> productList = Arrays.asList(new Product(Category.PHONE, 3000, 12),
                new Product(Category.PHONE,3200,2),
                new Product(Category.TELEVISION,2000,4),
                new Product(Category.PHONE,200,6),
                new Product(Category.CLOTHE,30000,56));
        return productList;
    }

    public static List<Product> sortedList(List<Product> list) {
        return list.stream().filter(p -> p.getCategory().equals(Category.PHONE)).filter(n -> n.getPrice() > 3000)
                .filter(b -> b.getDateOfManufacture() > 1).sorted(Comparator.comparingInt(Product::getPrice)).collect(Collectors.toList());
    }
}
