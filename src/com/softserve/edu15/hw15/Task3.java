package com.softserve.edu15.hw15;

public class Task3 {
    public static void main(String[] args) {
        Thread threadOne = new Thread(() -> {
            System.out.println("Thread one started");

            Thread threadTwo = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }

                Thread threadThree = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three");
                    }
                });

                threadThree.start();
            });

            threadTwo.start();
        });

        threadOne.start();
    }
}
