package com.softserve.edu06.hw;

public class FirstTaskBirds {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle(true, true);
        birds[1] = new Swallow(true, true);
        birds[2] = new Penguin(true, true);
        birds[3] = new Kiwi(true, true);

        for(Bird bird: birds){
            if(bird.fly() != null){
                System.out.println(bird.fly());
            }
        }
    }
}
