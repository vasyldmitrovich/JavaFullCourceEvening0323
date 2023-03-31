package com.softserve.edu06.pt01.obj;

public class Shape {

    public Shape(double side, String name) {
    }

    public double getArea() {
        return 0;
    }

    public static void main(String[] args) {
        Square shape = new Square(6.3, "NewSquare");
        System.out.println("Square area: " + shape.getArea());
        System.out.println("Square area: " + shape.getArea());
    }
}