package com.softserve.edu14.homework.taskOne;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Task with three thread");
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        ThreadThree threadThree = new ThreadThree();
        threadOne.start();
        threadOne.join();
        threadTwo.start();
        threadTwo.join();
        threadThree.start();
        threadThree.join();
    }
}
