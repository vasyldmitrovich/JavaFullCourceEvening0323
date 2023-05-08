package com.softserve.edu09.pt;

import com.softserve.edu08.pt.Department;

import java.util.ArrayList;

public class PracticalTask1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(new HeavyBox(10, "Papers"));
        heavyBoxes.add(new HeavyBox(20, "Stones"));
        heavyBoxes.add(new HeavyBox(30, "Dumbbells"));

        for (HeavyBox box : heavyBoxes) {
            System.out.println(box.contents);
        }

        heavyBoxes.get(0).weight = 1;

        heavyBoxes.remove(heavyBoxes.size() - 1);

        for (HeavyBox box : heavyBoxes) {
            System.out.println(box.contents + " " + box.weight + " kg.");
        }

        heavyBoxes.clear();

        System.out.println("Цей масив є порожнім? - " + heavyBoxes.isEmpty());
    }
}
