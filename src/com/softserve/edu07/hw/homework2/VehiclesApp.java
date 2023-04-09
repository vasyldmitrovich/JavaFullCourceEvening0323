package com.softserve.edu07.hw.homework2;

public class VehiclesApp {

    public static void main(String[] args) {
        Boat boat1 = new Boat(20, 78);
        boat1.isSailing();
        Liner liner1 = new Liner(200, 3);
        liner1.isSailing();
        Plane plane1 = new Plane(150, 3000);
        plane1.fly();
        plane1.land();
        Helicopter helicopter = new Helicopter(4, 500, 5);
        helicopter.fly();
        helicopter.land();
        Bus bus = new Bus(90, "Limassol-Larnaca");
        bus.drive();
        Car car = new Car(4, "Mini Cooper Sport D");
        car.drive();
        Motorcycle motorcycle = new Motorcycle(2, 300);
        motorcycle.drive();
    }
}
