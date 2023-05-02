package com.softserve.edu14.practical.taskTwo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnableOne = () -> {
            try {
                for (int i=0; i < 5; i++) {
                    System.out.println("Hello, world");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable runnableTwo = () -> {
            try {
                for (int i=0; i < 5; i++) {
                    System.out.println("Peace in the peace");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread threadOne = new Thread(runnableOne);
        Thread threadTwo = new Thread(runnableTwo);
        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
        System.out.println("My name is Evgen");
    }
}
