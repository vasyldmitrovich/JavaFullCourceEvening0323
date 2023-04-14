package com.softserve.edu06.pt;

public class SecondTaskVehicles {
    public static void main(String[] args) {
        Car[] cars = new Car[7];

        cars[0] = new Truck("Kenworth",160,2012,40000);
        cars[1] = new Truck("Peterbilt",150,2000,35000);
        cars[2] = new Truck("Ford",150,2015,35000);
        cars[3] = new Truck("Freightliner",170,2017,15000);
        cars[4] = new Sedan("Mitsubishi",160,2007,5);
        cars[5] = new Sedan("Toyota",180,2020,2);
        cars[6] = new Sedan("Honda",180,2025,4);

        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
