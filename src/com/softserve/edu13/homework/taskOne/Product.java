package com.softserve.edu13.homework.taskOne;

import java.util.Date;

public class Product {

    private String name;

    private Category category;

    private Date date;

    private double price;

    public Product() {
    }

    public Product(String name, Category category, Date date, double price) {
        this.name = name;
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", date=" + date +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        if (!getName().equals(product.getName())) return false;
        return getDate() != null ? getDate().equals(product.getDate()) : product.getDate() == null;
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        return result;
    }
}
