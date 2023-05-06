package com.softserve.edu15.pt;

public class Peace  implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println( i + ": Peace in the peace");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return;
    }
}
