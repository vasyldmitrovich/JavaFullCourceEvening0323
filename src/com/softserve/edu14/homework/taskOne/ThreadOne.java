package com.softserve.edu14.homework.taskOne;

public class ThreadOne extends Thread{

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("I love Ukraine!");
        }
    }
}
