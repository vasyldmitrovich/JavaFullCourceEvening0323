package com.softserve.edu15.hw;

public class ThreadThree implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<=4; i++)
            System.out.println("Thread number three.");
        return;
    }
}
