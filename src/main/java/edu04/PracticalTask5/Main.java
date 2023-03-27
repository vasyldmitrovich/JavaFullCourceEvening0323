package edu04.PracticalTask5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Pr1", 150, 2));
        products.add(new Product("Pr2", 500, 2));
        products.add(new Product("Pr3", 30, 1));
        products.add(new Product("Pr4", 760, 4));
        Product maxPrice = products.get(1);
        Product maxQuantity = products.get(1);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() > maxPrice.getPrice()) {
                maxPrice = products.get(i);
            }
        }
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getQuantity() > maxQuantity.getQuantity()) {
                maxQuantity = products.get(i);
            }
        }
        System.out.println("Item with the biggest price");
        System.out.println("Name of the product - " + maxPrice.getName() + ", quantity = " + maxPrice.getQuantity());
        System.out.println();
        System.out.println("Item with the biggest quantity");
        System.out.println(maxQuantity.getName());
    }


}
