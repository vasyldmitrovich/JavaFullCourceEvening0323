package com.softserve.edu06.pt06.pt01.inheritance;
//slide 15
public class Square extends edu06.inheritance.Point {
    private final double side;

    public Square(int x, int y, double side) {
        super(x,y);
        this.side = side;
    }
    protected void print() {
        super.print();
        System.out.print(" " + side);
    }
}

