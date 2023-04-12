package com.softserve.edu06.pt;

import java.util.ArrayList;
import java.util.List;

public class Pt06 {
    public static void main(String[] args) {
        //Task 1
        Truck volvo = new Truck("FH12", 100, 1993);
        Truck iveco = new Truck("Stralis", 120, 2002);
        Truck renault = new Truck("Magnum", 140, 1990);
        Sedan mazda = new Sedan("6", 240, 2019);
        volvo.run();
        iveco.run();
        renault.run();
        mazda.stop();

        //Task 2
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);
        Point point3 = new Point(10, 0);
        Point point4 = new Point(0, 10);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);
        ColorLine cline1 = new ColorLine(point2, point4, "red");
        ColorLine cline2 = new ColorLine(point1, point3, "green");

        List<Line> listOfLines = new ArrayList<>();
        listOfLines.add(line1);
        listOfLines.add(line2);
        listOfLines.add(cline1);
        listOfLines.add(cline2);

        for (Line element : listOfLines) {
            element.print();
        }

    }
}
