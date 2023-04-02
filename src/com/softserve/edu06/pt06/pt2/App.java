package com.softserve.edu06.pt06.pt2;

public class App {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Sedan("Toyota Camry", 220, 2010);
        cars[1] = new Sedan("Toyota Corolla", 190, 2016);
        cars[2] = new Sedan("Mazda 3", 200, 2018);
        cars[3] = new Truck("Mercedes", 150, 2017);
        cars[4] = new Truck("BWW", 180, 2010);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            cars[i].run();
            cars[i].stop();
            System.out.println();
        }
    }
}
