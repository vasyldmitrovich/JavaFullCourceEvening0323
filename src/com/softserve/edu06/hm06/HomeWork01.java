package com.softserve.edu06.hm06;

public class HomeWork01 {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle("feathers", true),
                new Swallow("feathers", true),
                new Penguin("feathers", true),
                new Kiwi("feathers", true)};

        for (Bird bird : birds) {
            bird.fly();

            if (bird instanceof FlyingBird) {
                System.out.println("This is a flying bird.");
            } else {
                System.out.println("This is a non-flying bird.");
            }
        }
    }
}
