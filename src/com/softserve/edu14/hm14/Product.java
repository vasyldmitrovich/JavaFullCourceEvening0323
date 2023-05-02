package com.softserve.edu14.hm14;

import java.util.*;

public class Product {
    private String category;
    private Date productionDate;
    private double price;

    public Product(String category, Date productionDate, double price) {
        this.category = category;
        this.productionDate = productionDate;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return category + " (" + productionDate + ", " + price + ")";
    }

    //Move main method to another class for example App.java

}
