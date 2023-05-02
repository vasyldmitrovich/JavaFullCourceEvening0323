package com.softserve.edu14.homework.taskTwo;

public class Main {

    public static void main(String[] args) {
        String lock1 = new String("Hello");
        String lock2 = new String("World");
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    System.out.println("Thread 1 acquired lock1");
                    Thread.sleep(1000);
                    synchronized (lock2) {
                        System.out.println("Thread 1 acquired lock2");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    System.out.println("Thread 2 acquired lock2");
                    Thread.sleep(1000);
                    synchronized (lock1) {
                        System.out.println("Thread 2 acquired lock1");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished");
    }
}
