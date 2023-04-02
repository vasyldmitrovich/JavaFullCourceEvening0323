package com.softserve.edu06.hw06.hw1;

public class App {
    public static void main(String[] args) {
        Bird [] bids = new Bird[5];
        bids[0]=new Eagle(20, "Wild", "Big", "Eurasia");
        System.out.println(bids[0]);
        bids[0].fly();
        System.out.println();
        bids[1]=new Kiwi(13, "Beaky", "Small", "Australia");
        System.out.println(bids[1]);
        bids[1].fly();
        System.out.println();
        bids[2]=new Swallow(15, "Red Swallow", "Small", "Eurasia");
        System.out.println(bids[2]);
        bids[2].fly();
        System.out.println();
        bids[3]=new Penguin(16, "White", "Emperor", "Southern Hemisphere");
        System.out.println(bids[3]);
        bids[3].fly();
        System.out.println();

    }
}
