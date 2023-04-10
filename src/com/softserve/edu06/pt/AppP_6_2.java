package com.softserve.edu06.pt;

public class AppP_6_2 {
    public static void main(String[] args) {
        Car car[] = new Car[5];
        car[0] = new Sedan("Audi A6", 220, 2018);
        car[1] = new Truck("Mitsumishi L200", 179, 2015);
        car[2] = new Sedan("Mazda 6", 180, 2014);
        car[3] = new Truck("Ford F300", 175, 2016);
        car[4] = new Sedan("Honda Accord", 200, 2015);

        System.out.println("Info about all cars");
        for (int i = 0; i < car.length; i++) {
            System.out.println("Model " + car[i].getModel() + "; max speed " + car[i].getMaxSpeed() + "; Year of production " + car[i].getYearOfProduction());
        }
    }
}
