package com.softserve.edu15.hw;

public class MyThread implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i <= 4; i++) {

            System.out.println("This is thread: " + Thread.currentThread().getId());
        }
        return;
    }
}