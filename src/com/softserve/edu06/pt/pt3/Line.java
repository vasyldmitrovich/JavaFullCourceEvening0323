package com.softserve.edu06.pt.pt3;

public class Line {
	private Point point1;
	private Point point2;
	
	public Line() {
	}
	
	public Line(Point point2, Point point1) {
		this.point2 = point2;
		this.point1 = point1;
	}
	
	public Point getPoint2() {
		return point2;
	}
	
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	
	public Point getPoint1() {
		return point1;
	}
	
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	
	@Override
	public String toString() {
		return "Line point1 - " + point2 + ", point2 - " + point1;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
}
