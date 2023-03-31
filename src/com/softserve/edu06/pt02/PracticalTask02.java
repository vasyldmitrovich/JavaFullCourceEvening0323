package com.softserve.edu06.pt02;

public class PracticalTask02 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Truck("Volvo", 80, 2010);
        cars[1] = new Sedan("Toyota Camry", 120, 2015);
        cars[2] = new Sedan("Honda Civic", 100, 2018);

        for (Car car : cars) {
            System.out.println("Model: " + car.getNameModel());
            System.out.println("Max Speed: " + car.getMaxSpeed());
            System.out.println("Year of Production: " + car.getYearOfProduction());
            car.run();
            car.stop();
            System.out.println();
        }
    }
}
