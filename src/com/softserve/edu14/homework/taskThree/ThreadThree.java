package com.softserve.edu14.homework.taskThree;

public class ThreadThree extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("Thread number three");
        }
        System.out.println("----Thread three finished----");
    }
}
