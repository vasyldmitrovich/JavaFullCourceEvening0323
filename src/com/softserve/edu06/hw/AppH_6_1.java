package com.softserve.edu06.hw;

public class AppH_6_1 {
    public static void main(String[] args) {
        Bird[] birds = { new Eagle(true,true),
                new Swallow(true,true),
                new Penguin(true,true),
                new Kiwi(true,true) };
        for (Bird bird : birds) {
            bird.fly();
            System.out.println("Has feathers: " + bird.hasFeathers());
            System.out.println("Lays eggs: " + bird.laysEggs());
            System.out.println();
        }
    }
}
