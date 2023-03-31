package com.softserve.edu05.practic.taskThree;

public class Main {
    public static void main(String[] args) {
        Line[] lineArray = new Line[4];
        lineArray[0] = new Line(new Point(3,4),new Point(3,2));
        lineArray[1] = new Line(new Point(12,14), new Point(34,24));
        lineArray[2] = new ColorLine(new Point(2,1),new Point(3,5),Color.BLACK);
        lineArray[3] = new ColorLine(new Point(12,3),new Point(24,23));
        for(Line line:lineArray){
            System.out.println(line.print());
        }
    }
}
