package com.softserve.edu06.pt;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point pnt1, Point pnt2, String color) {
        this.pnt1 = pnt1;
        this.pnt2 = pnt2;
        this.color = color;
    }

    public String toString() {
        return ("This is ColorLine");
    }

    public void print() {
        System.out.println(this.toString());
        System.out.println("Point 1:" + this.pnt1.x + " " + this.pnt1.y);
        System.out.println("Point 2:" + this.pnt2.x + " " + this.pnt2.y);
        System.out.println("Line color is: " + this.color);
    }

}

