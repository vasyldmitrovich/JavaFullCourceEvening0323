package com.softserve.edu06.hw;

public class HomeWork1 {
    public static void main(String[] args) {
        Bird birds[] = new Bird[4];
        birds[0] = new Eagle("Grey", 5);
        birds[1] = new Swallow("White", 4);
        birds[2] = new Penguin("Black", 0);
        birds[3] = new Kiwi("Green", 0);
        //Ok
        for (Bird bird : birds) {
            System.out.println(bird);
            System.out.println("Feathers " + bird.getFeathers() + " lay " + bird.getLayEggs() + " eggs.");
            bird.fly();
            System.out.println(" ");
        }
    }
}
