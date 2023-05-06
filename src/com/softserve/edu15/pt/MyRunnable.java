package com.softserve.edu15.pt;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 9; i++) {
            System.out.println( i + ": I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println( "Task 1 completed!");
        return;
    }
}
