package com.softserve.edu06.pt;

public class Line {
        private Point startPoint;
        private Point endPoint;

        public Line(Point startPoint, Point endPoint) {
                this.startPoint = startPoint;
                this.endPoint = endPoint;
        }

        public String toString() {
                return "Line  " + startPoint.toString() + " to " + endPoint.toString();
        }

        public void print() {
                System.out.println(toString());
        }
}
