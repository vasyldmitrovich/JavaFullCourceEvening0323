package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.List;

public class BoxApp {

    public static void main(String[] args) {//Cool, nice to see code like this
        // Create dynamic array contains objects of HeavyBox class
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(6, "toys"));
        boxes.add(new HeavyBox(5, "foods"));
        boxes.add(new HeavyBox(3, "foods"));
        boxes.add(new HeavyBox(15, "drugs"));
        boxes.add(new HeavyBox(10, "stationery"));
        boxes.add(new HeavyBox(11, "spares"));

        // Output array to the console
        printBoxes("Output initial boxes:", boxes);

        // Change the weight of the first box to 1
        HeavyBox box1 = boxes.get(0);
        boxes.set(0, new HeavyBox(1, box1.getContents()));
        // Remove the last box
        boxes.remove(boxes.size() - 1);

        // Output result to the console
        printBoxes("Output boxes after changes:", boxes);

        // Output result to the console
        boxes.removeAll(boxes);
        printBoxes("Output boxes after all boxes removed:", boxes);
    }

    public static void printBoxes(String message, List<HeavyBox> boxes) {
        System.out.println("\n" + message);
        if (boxes.size() == 0) {
            System.out.println("Array is empty");
        } else {
            int index = 0;
            for (HeavyBox b: boxes) {
                index++;
                System.out.println("Box #" + index + ": " + b);
            }
        }
    }
}
