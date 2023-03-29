package com.softserve.edu04.pt.practicaltask04_05;

import java.util.ArrayList;

public class ProductsApp {
    public static void main(String[] args) {
        Product product1 = new Product("Product1", 74.5, 10);
        Product product2 = new Product("Product2", 37.5, 110);
        Product product3 = new Product("Product3", 144.5, 90);
        Product product4 = new Product("Product4", 34.5, 55);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        /*Good but you can move this logic to some method*/
        // Output the name and quantity of the most expensive item
        System.out.println("Product which is most expensive: ");
        double highPrice = products.get(0).getPrice();
        Product productWithHighestPrice = products.get(0);
        for (int i = 1; i < 4; i++) {
            if (products.get(i).getPrice() > highPrice) {
                highPrice = products.get(i).getPrice();
                productWithHighestPrice = products.get(i);
            }
        }
        System.out.println("name: " + productWithHighestPrice.getName());
        System.out.println("quantity: " + productWithHighestPrice.getQuantity());

        // Output the name of the items, which has the biggest quantity
        System.out.println("Product which has the biggest quantity: ");
        int biggestQuantity = products.get(0).getQuantity();
        Product productWithBiggestQuantity = products.get(0);
        for (int i = 1; i < 4; i++) {
            if (products.get(i).getQuantity() > biggestQuantity) {
                biggestQuantity = products.get(i).getQuantity();
                productWithBiggestQuantity = products.get(i);
            }
        }
        System.out.println("name: " + productWithBiggestQuantity.getName());
    }
}
