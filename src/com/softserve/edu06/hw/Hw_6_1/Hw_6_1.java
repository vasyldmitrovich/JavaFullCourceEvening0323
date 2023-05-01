package com.softserve.edu06.hw.Hw_6_1;

public class Hw_6_1 {
    public static void main(String[] args) {

        Bird[] birds = new Bird[]{
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };
        for (Bird bird : birds) {
            bird.fly();


        }


    }
}
