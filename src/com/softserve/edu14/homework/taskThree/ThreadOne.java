package com.softserve.edu14.homework.taskThree;

public class ThreadOne extends Thread{

    @Override
    public void run() {
        System.out.println("---Thread number one start work---");
        ThreadTwo threadTwo = new ThreadTwo();
        threadTwo.start();
        try {
            threadTwo.join();
            System.out.println("----Thread one finished----");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
