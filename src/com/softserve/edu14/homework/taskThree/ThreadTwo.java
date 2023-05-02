package com.softserve.edu14.homework.taskThree;

public class ThreadTwo extends Thread{
    @Override
    public void run() {
        for(int i=0; i < 3; i++){
            System.out.println("Thread number two");
        }
        System.out.println("----Thread two finished, will be call thread three now----");
        ThreadThree threadThree = new ThreadThree();
        threadThree.start();
        try {
            threadThree.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
