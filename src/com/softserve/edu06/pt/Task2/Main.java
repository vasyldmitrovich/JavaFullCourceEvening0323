package com.softserve.edu06.pt.Task2;

public class Main {
    public static void main(String[] args) {
        Car sedan1 = new Sedan("Sedan1", 220, 2020);
        Car sedan2 = new Sedan("Sedan2", 280, 2013);
        Car truck1 = new Truck("Truck1", 200, 2000);
        Car truck2 = new Truck("Truck2", 190, 1989);

        Car[] array = {sedan1,sedan2,truck1,truck2};

        for (Car car : array){
            System.out.println(car + "\n" + car.run() + "\n" + car.stop());

        }
    }
}
