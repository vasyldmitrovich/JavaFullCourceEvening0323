package com.softserve.edu15.hw;

public class ThreadOne  implements Runnable {
    @Override
    public void run() {
        Runnable two = new ThreadTwo();
        Thread t = new Thread(two);
        t.start();
        return;
    }
}