package src.com.softserve.edu03.practic.taskFour;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product productOne = new Product("Banana", 25,20);
        Product productTwo = new Product("Milk",35,10);
        Product productThree = new Product("Tea",30,50);
        System.out.println(foundMostExpensive(productOne,productTwo,productThree));
        System.out.println(foundBiggestQuantity(productOne,productTwo,productThree).getName());
    }
    public static Product foundMostExpensive(Product ...products){
        return Arrays.stream(products)
                .reduce((product, product2) -> product.getPrice() > product2.getPrice() ? product : product2)
                .get();
    }
    public static Product foundBiggestQuantity(Product ...products){
        return Arrays.stream(products)
                .reduce((product, product2) -> product.getQuantity() > product2.getQuantity() ? product : product2)
                .get();
    }

}
