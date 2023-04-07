package com.softserve.edu06.pt;

public class PracticalTask3 {
    public static void main(String[] args) {
        Line line[] = new Line [5];
        line[0] = new Line(new Point(0, 0), new Point(1,1));
        line[1] = new ColorLine(new Point(1,1), new Point(2,2), "green");
        line[2] = new Line(new Point(2,2), new Point(3,3));
        line[3] = new ColorLine(new Point(3,3), new Point(4,4), "violet");
        line[4] = new Line(new Point(4,4), new Point(5,5));

        for (Line lines:line){
            lines.print();
        }
    }
}
