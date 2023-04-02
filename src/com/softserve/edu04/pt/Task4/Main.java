package com.softserve.edu04.pt.Task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("product1", 10, 123);
        Product product2 = new Product("product2", 20, 123);
        Product product3 = new Product("product3", 30, 4);
        Product product4 = new Product("product4", 40, 4);
        Product mostExpProduct = Product.getMostExp(product1, product2, product3, product4);
        System.out.println("Most expensive product is " + mostExpProduct.getName() +
                " in quantity " + mostExpProduct.getQuantity());
        String[] bigestQuant = Product.bigestQuant(product1, product2, product3, product4);

        System.out.println("Products with the largest quantity: ");
        for (int i = 0; i < bigestQuant.length; i++) {
            if (bigestQuant[i] == null) {
                continue;
            }
            System.out.println(bigestQuant[i]);
        }
    }
}
