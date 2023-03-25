package com.softserve.edu04.pt04;

public class Product {
    final private String name;
    final private double price;
    final private int quantity;

    public Product (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public static void main(String[] args) {
        Product product1 = new Product("Product #1", 20.5, 99);
        Product product2 = new Product("Product #2", 11.5, 95);
        Product product3 = new Product("Product #3", 3.0, 88);
        Product product4 = new Product("Product #4", 4.75, 91);

        // Find the name and quantity of the most expensive product
        Product mostExpensiveProduct = product1;
        for (Product product : new Product[] { product2, product3, product4 }) {
            if (product.getPrice() > mostExpensiveProduct.getPrice()) {
                mostExpensiveProduct = product;
            }
        }
        System.out.println("The most expensive product is " + mostExpensiveProduct.getName() +
                " with quantity " + mostExpensiveProduct.getQuantity());

//        // Find the names of the products with the highest quantity
//        List<Product> products = Arrays.asList(product1, product2, product3, product4);
//        Collections.sort(products, new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return Integer.compare(p2.getQuantity(), p1.getQuantity());
//            }
//        });
//
//        int highestQuantity = products.get(0).getQuantity();
//        System.out.print("The products with the highest quantity are: ");
//        for (Product product : products) {
//            if (product.getQuantity() == highestQuantity) {
//                System.out.print(product.getName() + " ");
//            }
//        }
        // Find the names of the products with the highest quantity
        int maxQuantity = product1.getQuantity();
        String[] maxQuantityProducts = new String[4];
        int numMaxQuantityProducts = 0;

        for (Product product : new Product[] { product1, product2, product3, product4 }) {
            if (product.getQuantity() > maxQuantity) {
                maxQuantity = product.getQuantity();
                maxQuantityProducts[0] = product.getName();
                numMaxQuantityProducts = 1;
            } else if (product.getQuantity() == maxQuantity) {
                maxQuantityProducts[numMaxQuantityProducts] = product.getName();
                numMaxQuantityProducts++;
            }
        }

        System.out.print("The products with the highest quantity are: ");
        for (int i = 0; i < numMaxQuantityProducts; i++) {
            System.out.print(maxQuantityProducts[i] + " ");
        }
    }
}
