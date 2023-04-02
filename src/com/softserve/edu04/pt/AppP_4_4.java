package com.softserve.edu04.pt;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AppP_4_4 {
    public static void main(String[] args) {
        Product p1 = new Product("Iphone 7", 200.0, 5);
        Product p2 = new Product("Iphone 8", 300.0, 9);
        Product p3 = new Product("Iphone 10", 600.0, 20);
        Product p4 = new Product("Iphone 12", 750.0, 33);
        double arrP[] = {p1.getPrice(), p2.getPrice(), p3.getPrice(), p4.getPrice()};

        double maxPrice = p1.getPrice();
        for (int i = 1; arrP.length > i; i++) {
            if (maxPrice < arrP[i]) {
                maxPrice = arrP[i];
            }
        }
        System.out.println("The biggest cost of the product is --> " + maxPrice);
        System.out.println(p4.getName() + " quantitiy is " + p4.getQuantity());
        if (p3.getQuantity() > 10) {
            System.out.println("We have a lot " + p3.getName());
        }
        if (p4.getQuantity() > 10) {
            System.out.println("We have a lot " + p4.getName());
        }

    }
}


