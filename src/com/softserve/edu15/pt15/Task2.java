package com.softserve.edu15.pt15;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        Thread helloThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, world");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread peaceThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the peace");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        helloThread.start();
        peaceThread.start();
        helloThread.join();
        peaceThread.join();
        System.out.println("My name is Tanya");
    }
}

