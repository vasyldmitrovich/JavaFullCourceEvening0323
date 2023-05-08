package com.softserve.edu12.pt;

import java.awt.*;
import java.util.Scanner;

import static com.softserve.edu12.pt.Color.GREEN;
import static com.softserve.edu12.pt.Color.WHITE;

public class PracticalTask2 {
    public static void main(String[] args) throws ColorException {
        Plant plants[] = new Plant[5];
        try {
            plants[0] = new Plant(100, "GREEN", "TREE");
            plants[1] = new Plant(10, "WHITE", "FLOWER");
            plants[2] = new Plant(12, "YELLOW", "FLOWER");
            plants[3] = new Plant(5, "GREEN", "GRASS");
            plants[4] = new Plant(80, "RED", "TREE");
        } catch (ColorException | TypeException e) {
            System.out.println(e.getMessage());
        }

        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }
}
