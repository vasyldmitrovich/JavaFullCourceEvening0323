package com.softserve.edu06.pt06.pt3;

public class App {
    public static void main(String[] args) {
        Line lines[] = new Line[4];
        lines[0] = new Line(new Point(2, 2), new Point(1, 2));
        lines[1] = new Line(new Point(0, 0), new Point(7, 5));
        lines[2] = new ColorLine(new Point(1, 8), new Point(6, 4), "Blue");
        lines[3] = new ColorLine(new Point(1, 2), new Point(1, 2), "Red");
        for (int i = 0; i < lines.length; i++) {
            lines[i].print(lines[i]);
            System.out.println();
        }
    }
}
