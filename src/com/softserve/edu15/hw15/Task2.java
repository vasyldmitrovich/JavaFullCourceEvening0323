package com.softserve.edu15.hw15;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        Object firstLock = new Object();
        Object secondLock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (firstLock) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (secondLock) {
                    System.out.println("Thread 1 acquired both locks");
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            synchronized (secondLock) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (firstLock) {
                    System.out.println("Thread 2 acquired both locks");
                }
            }
        });
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Main method finished");
    }
}
