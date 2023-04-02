package com.softserve.edu04.pt;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){}
    public Product(String name, double price, int quantity){
        this.name        = name;
        this.price       = price;
        this.quantity    = quantity;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    public static String getProductWithMaxQuantity(Product...args){
        int maxQuantity  = args[0].getQuantity();
        String result    = "";

        for(int i = 1; i < args.length; i++){
            if(args[i].getQuantity() > maxQuantity){
                maxQuantity = args[i].getQuantity();
            }
        }

        for (Product p : args) {
            if (p.getQuantity() == maxQuantity){
                result = result + p.getName() + "\n";
            }
        }
        return result;
    }
}
