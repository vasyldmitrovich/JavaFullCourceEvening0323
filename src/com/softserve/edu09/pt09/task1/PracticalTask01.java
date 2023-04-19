package com.softserve.edu09.pt09.task1;

import java.util.ArrayList;

public class PracticalTask01 {
    public static void main(String[] args) {
// Create an ArrayList to store objects of HeavyBox
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<HeavyBox>();

        // Add HeavyBox objects to the ArrayList
        heavyBoxes.add(new HeavyBox(10, "Box 1"));
        heavyBoxes.add(new HeavyBox(20, "Box 2"));
        heavyBoxes.add(new HeavyBox(30, "Box 3"));

        // Change the weight of the first box to 1
        heavyBoxes.get(0).weight = 1;

        // Delete the last box
        heavyBoxes.remove(heavyBoxes.size() - 1);

        // Display the updated contents of HeavyBoxes on the console
        System.out.println("Contents of HeavyBoxes after modifications:");
        for (HeavyBox box : heavyBoxes) {
            System.out.println("Weight: " + box.getWeight() + ", Contents: " + box.getContents());
        }

        // Delete all boxes
        heavyBoxes.clear();

        // Display the contents of HeavyBoxes after deleting all boxes
        System.out.println("Contents of HeavyBoxes after deleting all boxes:");
        for (HeavyBox box : heavyBoxes) {
            System.out.println("Weight: " + box.getWeight() + ", Contents: " + box.getContents());
        }
    }
}
