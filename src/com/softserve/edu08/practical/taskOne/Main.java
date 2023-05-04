package com.softserve.edu08.practical.taskOne;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> heavyBoxArrayList = new ArrayList<>();
        heavyBoxArrayList.add(new HeavyBox(20,"apple"));
        heavyBoxArrayList.add(new HeavyBox(10,"pen"));
        heavyBoxArrayList.add(new HeavyBox(30,"boll"));
        System.out.println("All collection");
        heavyBoxArrayList.forEach((heavyBox -> System.out.println(heavyBox)));
        HeavyBox heavyBoxFirst = heavyBoxArrayList.get(0);
        heavyBoxFirst.setWeight(changeWeight(heavyBoxFirst));
        heavyBoxArrayList.remove(heavyBoxArrayList.size()-1);
        System.out.println("After delete last elem deleted and change weight first element on 1");
        heavyBoxArrayList.forEach((heavyBox -> System.out.println(heavyBox)));
        heavyBoxArrayList.removeAll(heavyBoxArrayList);
        System.out.println("After all deleted");
        heavyBoxArrayList.forEach((heavyBox -> System.out.println(heavyBox)));
    }

    private static int changeWeight(HeavyBox heavyBox){
        return heavyBox.getWeight()+1;
    }
}
