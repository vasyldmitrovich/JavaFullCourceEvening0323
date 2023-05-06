package com.softserve.edu15.hw;

import com.softserve.edu15.pt.MyRunnable;

import static java.lang.Thread.State.TERMINATED;

public class Hw15 {
    public static void main(String[] args) throws InterruptedException {

        //Task 1
        Runnable thread1 = new MyThread();
        Thread t1 = new Thread(thread1);
        t1.start();
        Runnable thread2 = new MyThread();
        Thread t2 = new Thread(thread2);
        t2.start();
        Runnable thread3 = new MyThread();
        do{
            Thread.sleep(1000); // checking if thread from Task 1 finished
        }while (t1.getState()!=TERMINATED & t2.getState()!=TERMINATED);
        Thread t3 = new Thread(thread3);
        t3.start();




    }
}
