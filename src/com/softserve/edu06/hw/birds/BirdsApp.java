package com.softserve.edu06.hw.birds;

public class BirdsApp {

    public static void main(String[] args) {
        Bird bird1 = new Eagle();
        Bird bird2 = new Swallow();
        Bird bird3 = new Kiwi();
        Bird bird4 = new Penguin();

        Bird[] birds = {bird1, bird2, bird3, bird4};

        for (Bird b: birds) {
            b.fly();
        }
    }
}
