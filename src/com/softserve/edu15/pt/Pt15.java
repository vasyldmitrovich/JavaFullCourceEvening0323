package com.softserve.edu15.pt;

import static java.lang.Thread.State.TERMINATED;

public class Pt15 {

    public static void main(String[] args) throws InterruptedException {
        //Task 1
        Runnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();

        //Task 2
        Runnable hello = new HelloWorld();
        Runnable peace = new Peace();
        Thread h = new Thread(hello);
        Thread p = new Thread(peace);
        do{
            Thread.sleep(1000); // checking if thread from Task 1 finished
        }while (t.getState()!=TERMINATED);
        h.start();
        p.start();
        do{
            Thread.sleep(2000); //interest thing if set this value to 1000
        }while(h.getState()!=TERMINATED & p.getState()!=TERMINATED); // waiting while both threads finished and print name
        System.out.println("My name is Roman");
    }
}

