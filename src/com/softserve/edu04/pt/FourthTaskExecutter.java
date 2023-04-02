package com.softserve.edu04.pt;

public class FourthTaskExecutter {
    public static void main(String[] args) {
        Product prod1 = new Product();
        prod1.setName("RAM 16GB");
        prod1.setPrice(3853.49);
        prod1.setQuantity(10);

        Product prod2 = new Product("Keyboard",300.0,5);

        Product prod3 = new Product();
        prod3.setName("Chair");
        prod3.setPrice(12600.0);
        prod3.setQuantity(1);

        Product prod4 = new Product("Laptop",35000.0,2);

        System.out.println("Products with the biggest quantity:\n" + Product.getProductWithMaxQuantity(prod1, prod2, prod3, prod4));
    }
}
