package com.softserve.edu06.pt;

public class task3 {
    public static void main(String[] args) {


        Line[] lines = new Line[3];
        lines[0] = new Line(new Point(0, 0), new Point(1, 1));
        lines[1] = new Line(new Point(0, 0), new Point(1, 1));
        lines[2] = new ColorLine(new Point(0, 0), new Point(1, 1),"Blue");
        for (Line line : lines) {
            line.print();
        }
    }

}
class Line{
    public Point point1;
    public Point point2;

    public Line(Point point1,Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public Line() {

    }
    @Override
    public String toString() {
        return "point1 -" + point1 +"\n"+ " point2- " + point2;
    }

    public void print() {
        System.out.println(toString());
    }
}
class ColorLine extends Line{
    private String color;

    public ColorLine(Point point1,Point point2, String color) {
        super(point1,point2);
        this.color=color;
    }
    @Override
    public String toString() {return "point1 -" + point1 +"\n"+ " point2- " + point2 +"\t"+ "color is  "+ color;
    }
    public void print() {
        System.out.println(toString());
    }
}
class Point{
    private  int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int  GetX() {
        return x;
    }

    public void SetX(int x) {

        this.x = x;
    }
    public int  GetY() {
        return y;
    }

    public void SetY(int y) {

        this.y= y;
    }
   @Override
    public String toString() {
        return   "x= "+x+"; "+"y= "+y;
    }
    void print() {
        System.out.println(
                toString()
        );}
}