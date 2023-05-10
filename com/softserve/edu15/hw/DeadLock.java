package com.softserve.edu15.hw;

public class DeadLock  implements Runnable {
    @Override
    public void run() {
        System.exit(0);
        return;
    }
}
