package com.softserve.edu09.pt.Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<HeavyBox> list = new ArrayList<>(Arrays.asList(
                new HeavyBox(10, "box1"),
                new HeavyBox(15, "box2"),
                new HeavyBox(20, "box3"),
                new HeavyBox(25, "box4")
        ));

        for (HeavyBox box : list) {
            System.out.println(box);
        }

        list.get(0).setWeight(list.get(0).getWeight() + 1);

        list.remove(list.size() - 1);

        list.removeAll(list);

        for (HeavyBox box : list) {
            System.out.println(box);
        }
    }
}
