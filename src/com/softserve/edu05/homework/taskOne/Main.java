package com.softserve.edu05.homework.taskOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bird[] birdArray = new Bird[6];
        birdArray[0] = new NotFlyingBird("steering",true);
        birdArray[1] = new FlyingBird("down feather",true);
        birdArray[2] = new Kiwi("thread pen",true);
        birdArray[3] = new Penguin("cover pen",true);
        birdArray[4] = new Eagle("fly feather", false);
        birdArray[5] = new Swallow("fly feather", true);
        for(Bird bird : birdArray){
            System.out.println(bird.fly());
        }
        System.out.println(Arrays.toString(birdArray));
    }
}
