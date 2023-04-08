package com.softserve.edu07.hw07.hw2;

public class App {
    public static void main(String[] args) {
        Passengers passengers [] = new Passengers[7];
        passengers [0] = new Boat(3);
        passengers [1]= new Liner(2);
        passengers [2] = new Car(4);
        passengers [3] = new Bus(6);
        passengers[4]= new Motorcycle(1);
        passengers[5]= new Helicopter(2);
        passengers[6]= new Plane(9);
        for (int i=0; i<2; i++){
            ((WaterVehicle) passengers[i]).isSailing();
        }
        for (int i=2; i<5; i++){
            ((GroundVehicle) passengers[i]).drive();
        }
        for (int i=5; i<7; i++){
            ((FlayingVehicle) passengers[i]).fly();
        }
    }
}
