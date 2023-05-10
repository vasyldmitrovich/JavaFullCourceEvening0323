package com.softserve.edu15.hw;

public class ThreadTwo implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<=2; i++)
        System.out.println("Thread number two.");
        Runnable three = new ThreadThree();
        Thread th = new Thread(three);
        th.start();
        return;
    }
}