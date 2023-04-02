package com.softserve.edu04.pt.Task4;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private int quantity;


    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static Product getMostExp(Product... products) {
        Product mostExpProduct = new Product();
        double maxPrice = 0;
        for (Product product : products) {
            if (product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
                mostExpProduct = product;
            }
        }
        return mostExpProduct;
    }

    public static String[] bigestQuant(Product... products) {
        int maxQuant = 0;
        int counter = 0;
        String[] allMaxQuantProducts = new String[4];
        for (Product product : products) {
            if (product.getQuantity() > maxQuant) {
                maxQuant = product.getQuantity();
                allMaxQuantProducts[0] = product.getName();
                counter++;
            } else if (product.getQuantity() == maxQuant) {
                allMaxQuantProducts[counter] = product.getName();
                counter++;
            }
        }
        return allMaxQuantProducts;
    }
}
