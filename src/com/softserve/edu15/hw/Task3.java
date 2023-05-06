package com.softserve.edu15.hw;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        Runnable one = new ThreadOne();
        Thread o = new Thread(one);
        o.start();
    }
}