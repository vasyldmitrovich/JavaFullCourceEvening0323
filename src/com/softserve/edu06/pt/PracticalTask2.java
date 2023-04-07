package com.softserve.edu06.pt;

public class PracticalTask2 {
    public static void main(String[] args) {

        Car car[] = new Car[4];
        car[0] = new Truck("Ford", 250, 2010);
        car[1] = new Truck("Toyota", 280, 2018);
        car[2] = new Sedan("Audi", 220, 2008);
        car[3] = new Sedan("Mercedes", 290, 2020);

        for (Car cars : car) {
            System.out.println("Model " + cars.getModel());
            System.out.println("Maximum speed " + cars.getMaxSpeed());
            System.out.println("Year of production " + cars.getYearOfProduction());
            cars.run();
            cars.stop();
            System.out.println(" ");
        }
    }
}
