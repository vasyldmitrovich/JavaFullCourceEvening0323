package com.softserve.edu06.pt;

public class Line {
    protected Point pnt1, pnt2;

    public Line() {
        this.pnt1 = new Point(0, 0);
        this.pnt2 = new Point(0, 0);
    }

    public Line(Point pnt1, Point pnt2) {
        this.pnt1 = pnt1;
        this.pnt2 = pnt2;
    }

    public String toString() {
        return ("This is Line");
    }

    public void print() {
        System.out.println(this.toString());
        System.out.println("Point 1:" + this.pnt1.x + " " + this.pnt1.y);
        System.out.println("Point 2:" + this.pnt2.x + " " + this.pnt2.y);
    }
}
