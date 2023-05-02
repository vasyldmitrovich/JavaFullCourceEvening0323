package com.softserve.edu09.pt;

import java.util.ArrayList;

public class HeavyBox {
    private int weight;
    private String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }




    public static void main(String[] args) {
//        First part
        ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add( new HeavyBox(10,"spoons") );
        boxes.add( new HeavyBox(15,"toys") );
        boxes.add( new HeavyBox(20,"books") );

        for (HeavyBox box :boxes){
            System.out.println("Box content: "+box.getContents()+" it`s weight: "+box.getWeight());
        }
//        Second part
        System.out.println(" Changed the weight of the first box by 1 and Removed the last box:");

        boxes.get(0).setWeight(boxes.get(0).getWeight() + 1);
        boxes.remove(boxes.size() - 1);

        for (HeavyBox box :boxes){
            System.out.println("Box content: "+box.getContents()+" it`s weight: "+box.getWeight());
        }
//      Third part
        boxes.clear();
        System.out.println("Removing boxes:");
        for (HeavyBox box :boxes){
            System.out.println("Box content: "+box.getContents()+" it`s weight: "+box.getWeight());
        }

    }


}
