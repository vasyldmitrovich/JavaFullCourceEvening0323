package com.softserve.edu06.pt.pointline;

public class LinesApp {

    public static void main(String[] args) {
        Point point1 = new Point(0, 5);
        Point point2 = new Point(1, 6);
        Point point3 = new Point(2, 7);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point1, point3);
        Line line3 = new ColorLine(point2, point3, "Black");

        Line[] lines = {line1, line2, line3};

        for (Line l: lines) {
            l.print();
        }
    }
}
