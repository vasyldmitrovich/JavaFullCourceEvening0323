package com.softserve.edu06.pt.pt3;

public class ColorLine extends Line {
	private String color;
	
	public ColorLine(String color) {
		this.color = color;
	}
	
	public ColorLine(Point a, Point b, String color) {
		super(a, b);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "ColorLine color - " + color + ", point1 - " + getPoint1() + ", point2 - " + getPoint2();
	}
	
	public void print() {
		System.out.println(this.toString());
	}
}
