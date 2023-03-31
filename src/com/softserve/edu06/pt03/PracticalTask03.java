package com.softserve.edu06.pt03;

public class PracticalTask03 {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(0, 0), new Point(1, 1)),
                new ColorLine(new Point(1, 1), new Point(2, 3), "red"),
                new Line(new Point(2, 3), new Point(4, 5)),
                new ColorLine(new Point(4, 5), new Point(6, 7), "blue")
        };

        for (Line line : lines) {
            line.print();
        }
    }
}
