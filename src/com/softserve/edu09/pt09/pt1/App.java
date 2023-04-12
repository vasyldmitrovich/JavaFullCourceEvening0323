package com.softserve.edu09.pt09.pt1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Object> heavyBoxList = new ArrayList<>();
        heavyBoxList.add(new HeavyBox(3, "toy1"));
        heavyBoxList.add(new HeavyBox(2, "toy2"));
        heavyBoxList.add(new HeavyBox(2, "toy3"));
        heavyBoxList.add(new HeavyBox(1, "toy4"));
        heavyBoxList.add(new HeavyBox(5, "toy5"));
        System.out.println("Show all context of elements");
        for (Object box : heavyBoxList
        ) {
            System.out.println(((HeavyBox) box).getContents());
        }
        System.out.println();
        System.out.println(heavyBoxList.get(0));
        System.out.println("Change weight");
        ((HeavyBox) heavyBoxList.get(0)).setWeight(1);
        System.out.println(heavyBoxList.get(0));
        System.out.println();
        for (Object box : heavyBoxList
        ) {
            System.out.println(box);
        }
        System.out.println("Remove the last box");
        heavyBoxList.remove(heavyBoxList.size() - 1);
        for (Object box : heavyBoxList
        ) {
            System.out.println(box);
        }
        System.out.println();
        System.out.println("Remove all boxes");
        heavyBoxList.clear();
        System.out.println(heavyBoxList);
    }
}

