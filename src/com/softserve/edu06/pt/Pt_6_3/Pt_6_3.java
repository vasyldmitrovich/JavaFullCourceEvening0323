package com.softserve.edu06.pt.Pt_6_3;


public class Pt_6_3 {
    public static void main(String[] args) {
        Line[] lines = new Line[3];
        lines[0] = new Line(new Point(0, 0), new Point(5,5));
        lines[1] = new ColorLine(new Point(3, 3), new Point(8, 8), "blue");
        lines[2] = new ColorLine(new Point(1, 1), new Point(6, 6), "red");

        for (Line line : lines) {
            line.print();
        }
    }
}

