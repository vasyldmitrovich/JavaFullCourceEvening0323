package com.softserve.edu06.pt01.rectangle;

import com.softserve.edu06.pt01.Parallelogram;
import com.softserve.edu06.pt01.Rectangle;

//slide 10
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(42);
        rectangle.setHeight(74);

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.setWidth(42);   // inherit from Rectangle
        parallelogram.setHeight(74);  // inherit from Rectangle
        parallelogram.angle = 35;

        int perimeter = parallelogram.getPerimeter(); // inherit from Rectangle
        int area = parallelogram.getArea();

        System.out.println("Perimeter of parallelogram equals " + perimeter);
        System.out.println("Area of parallelogram equals " + area);
    }
}
