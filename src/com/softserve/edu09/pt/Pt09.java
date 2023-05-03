package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.List;

public class Pt09 {
    public static void main(String[] args) {
//Task 1
        HeavyBox box1 = new HeavyBox(5, "Salt");
        HeavyBox box2 = new HeavyBox(15, "Water");
        HeavyBox box3 = new HeavyBox(20, "Steel");
        HeavyBox box4 = new HeavyBox(25, "Lead");
        HeavyBox box5 = new HeavyBox(35, "Uranium");

        List<HeavyBox> list = new ArrayList();
        list.addAll(List.of(box1,box2,box3,box4,box5));
        System.out.println("Description of source data:");
        for(HeavyBox b : list){
            System.out.println(b);
        }
        System.out.println("List size: " + list.size());
        System.out.println("\nChange the weight of the first box by 1.");
        System.out.print("Box1 current weight: ");
        System.out.println(box1.getWeight());
        box1.setWeight(box1.getWeight()+1);
        System.out.print("Box1 weight + 1 = ");
        System.out.println(box1.getWeight());

        System.out.println("\r\nRemove the last box.");
        list.remove(list.size() - 1);
        for(HeavyBox b : list){
            System.out.println(b);
        }
        System.out.println("List size: " + list.size());

        System.out.println("\r\nList clear()");
        list.clear();
        System.out.println("List size: " + list.size());

//Task 2
        List<Integer> numbers = new ArrayList<>();
        List<Integer> toRemove = new ArrayList<>();
        numbers.addAll(List.of(1, 2, 3, 4, 4, 5, 6, 6, 7, 8));
        System.out.println("Starting with these numbers: " + numbers);
        for(Integer n : numbers){
            while(numbers.lastIndexOf(n)!=numbers.indexOf(n) && numbers.lastIndexOf(n)>0){
                numbers.remove(n);
            }
        }
        System.out.println("Result: " + numbers);

    }
}
