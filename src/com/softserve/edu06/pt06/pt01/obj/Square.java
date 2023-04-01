package com.softserve.edu06.pt06.pt01.obj;

public class Square extends Shape {
    private final double side;

    public Square(double side, String name) {
        super(side, name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    public static void main(String[] args) {
        Square square = new Square(6.3, "NewSquare");
        System.out.println("Square area: " + square.getArea());
        System.out.println("Shape area: " + ((Shape) square).getArea());
    }
}