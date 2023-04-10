package com.softserve.edu06.pt;

public class Line {
        private Point FirstPoint;
        private Point SecondPoint;

        public Line(Point FirstPoint, Point SecondPoint) {
                this.FirstPoint = FirstPoint;
                this.SecondPoint = SecondPoint;
        }

        public String toString() {
                return "Line  " + FirstPoint.toString() + " to " + SecondPoint.toString();
        }

        public void print() {
                System.out.println(toString());
        }
}
