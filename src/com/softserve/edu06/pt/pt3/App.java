package com.softserve.edu06.pt.pt3;

public class App {
	public static void main(String[] args) {
		Point point1 = new Point(2,4);
		Point point2 = new Point(3,6);
		Line line1 = new Line(point1, point2);
		Line line2 = new Line(point2, point1);
		ColorLine colorLine1 = new ColorLine(point1,point2, "black");
		ColorLine colorLine2 = new ColorLine(point2, point1, "green");
		Line[] lines = new Line[]{line1, line2, colorLine1, colorLine2};
		for (Line line : lines) {
			line.print();
		}
	}
}
