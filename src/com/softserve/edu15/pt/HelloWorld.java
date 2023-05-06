package com.softserve.edu15.pt;

public class HelloWorld implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println( i + ": Hello, world");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return;
    }
}