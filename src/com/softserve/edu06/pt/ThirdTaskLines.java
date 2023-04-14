package com.softserve.edu06.pt;

public class ThirdTaskLines {
    public static void main(String[] args) {
        Line[] lines = new Line[5];
        lines[0] = new Line(new Point(12,25), new Point(20,25));
        lines[1] = new ColorLine(new Point(45,-21), new Point(45,21), "cyan");
        lines[2] = new Line(new Point(78,78), new Point(69,12));
        lines[3] = new ColorLine(new Point(78,65), new Point(48,14), "purple");
        lines[4] = new ColorLine(new Point(55,11), new Point(64,18), "green");

        for(Line line : lines){
            System.out.println(line);
        }
    }
}
