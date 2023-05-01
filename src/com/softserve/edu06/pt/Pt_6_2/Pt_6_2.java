package com.softserve.edu06.pt.Pt_6_2;



public class Pt_6_2 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Truck("Ford F-150", 180, 2010);
        cars[1] = new Sedan("Toyota Camry", 200, 2020);
        cars[2] = new Truck("Chevy Silverado", 170, 2015);

        for (Car car : cars) {
            System.out.println("Model: " + car.getModel());
            System.out.println("Max speed: " + car.getMaxSpeed());
            System.out.println("Year of production: " + car.getYearOfProduction());
            car.run();
            car.stop();
            System.out.println();
        }
    }
}

