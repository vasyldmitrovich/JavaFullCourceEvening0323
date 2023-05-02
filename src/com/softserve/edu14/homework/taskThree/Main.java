package com.softserve.edu14.homework.taskThree;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task with call thread one, two and three");
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
    }
}
