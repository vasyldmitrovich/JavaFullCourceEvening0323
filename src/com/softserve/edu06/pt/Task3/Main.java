package com.softserve.edu06.pt.Task3;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(new Point(10, 10), new Point(20, 20));
        Line line2 = new Line(new Point(30, 30), new Point(40, 40));
        Line line3 = new ColorLine(new Point(50, 50), new Point(60, 60), "green");
        Line line4 = new ColorLine(new Point(70, 70), new Point(80, 80), "red");
        Line[] array = {line1, line2, line3, line4};
        for (Line line : array) {
            line.print();
        }
    }
}
