package com.softserve.edu06.pt.cars;

public class CarsApp {
    public static void main(String[] args) {
        //Olga respects all is nice and good
        Car car1 = new Sedan("Audi A6", 300, 2010);
        Car car2 = new Sedan("KIA Sportage", 240, 2019);
        Car car3 = new Truck("MAN", 200, 2002);
        Car car4 = new Truck("Volvo", 220, 2012);

        Car[] cars = {car1, car2, car3, car4};

        for (Car c: cars) {
            System.out.println(c);
            c.run();
            c.stop();
        }
    }
}
