package com.softserve.edu14.hm14;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Product> products = generateProducts();
        System.out.println("All products: " + products);

        List<Product> phoneProducts = getPhoneProducts(products);
        System.out.println("Phone products with price > 3000 and production date > 1 year ago: " + phoneProducts);
    }

    //That and next method move to App.java too
    private static List<Product> generateProducts() {
        String[] categories = {"Phone", "Laptop", "TV", "Smartwatch"};
        List<Product> products = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            String category = categories[random.nextInt(categories.length)];
            Date productionDate = new Date(System.currentTimeMillis() - random.nextInt((int) (365 * 24 * 60 * 60 * 1000L)));
            double price = random.nextDouble() * 5000 + 1000;

            products.add(new Product(category, productionDate, price));
        }

        return products;
    }

    private static List<Product> getPhoneProducts(List<Product> products) {
        List<Product> phoneProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.getCategory().equals("Phone") && product.getPrice() > 3000 &&
                    product.getProductionDate().before(new Date(System.currentTimeMillis() - 365 * 24 * 60 * 60 * 1000L))) {
                phoneProducts.add(product);
            }
        }

        phoneProducts.sort(Comparator.comparingDouble(Product::getPrice));

        return phoneProducts;
    }
}
