package com.softserve.edu09.pt;

import java.util.Arrays;

public class AppP_9_1 {
    public static void main(String[] args) {

        //create our boxes
        HeavyBox[] boxes = new HeavyBox[3];
        boxes[0] = new HeavyBox(10, "Books");
        boxes[1] = new HeavyBox(20, "Clothes");
        boxes[2] = new HeavyBox(30, "Photos");

        // use for each loop to print my objects
        for (HeavyBox box : boxes) {
            System.out.println("Weight: " + box.getWeight() + ", Content: " + box.getContent());
        }

        // make changes to the objects
        boxes[0].weight += 1;
        boxes = Arrays.copyOfRange(boxes, 0, boxes.length - 1);

        System.out.println("//////////////");

        //print changed array
        for (HeavyBox box : boxes) {
            System.out.println("Weight: " + box.getWeight() + ", Content: " + box.getContent());
        }

        System.out.println("//////////////");

        //delete all objects and print empty  array
        boxes = new HeavyBox[0];
        for (HeavyBox box : boxes) {
            System.out.println("Weight: " + box.getWeight() + ", Content: " + box.getContent());
        }



    }
}
