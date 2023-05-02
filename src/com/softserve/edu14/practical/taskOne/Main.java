package com.softserve.edu14.practical.taskOne;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Output text «I study Java» 10 times with the intervals of one second");
        for(int i=0; i < 10; i++){
            System.out.println("I study Java");
            Thread.sleep(1000);
        }
    }
}
