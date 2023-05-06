package com.softserve.edu15.hw;

import static java.lang.Thread.State.TERMINATED;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        //Task 2
        Runnable deadLock = new DeadLock();
        Thread dl = new Thread(deadLock);
        dl.start();
        while (dl.getState()!=TERMINATED){
            System.out.println(dl.getState());
        }
    }
}
