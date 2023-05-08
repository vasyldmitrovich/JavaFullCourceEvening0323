package com.softserve.edu14.hw;

import java.time.LocalDate;

public class Product {
    private String manufacture;
    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufacture, String category, LocalDate dateOfManufacture, double price) {
        this.manufacture = manufacture;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacture='" + manufacture + '\'' +
                ", category='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}
