package com.softserve.edu07.hw;

import java.util.Arrays;

public class SecondTaskVehicles {
    public static void main(String[] args) {
        Passengers[] vehicles = new Passengers[7];
        vehicles[0] = new Liner(300,2);
        vehicles[1] = new Plane(140,5000);
        vehicles[2] = new Bus(20,"Kalush - Ivano-Frankivsk");
        vehicles[3] = new Boat(6,8);
        vehicles[4] = new Helicopter(8, 1500, 300);
        vehicles[5] = new Motorcycle(1, 150);
        vehicles[6] = new Car(5,"Mitsubishi L200");

        System.out.println("Unsorted array:");
        System.out.println();
        for(Passengers vehicle: vehicles){
            if(vehicle instanceof FlyingVehicle){
                ((FlyingVehicle) vehicle).fly();
                ((FlyingVehicle) vehicle).land();
            } else if(vehicle instanceof WaterVehicle){
                ((WaterVehicle) vehicle).isSailing();
            } else {
                ((GroundVehicle) vehicle).drive();
            }
        }
        System.out.println();

        Arrays.sort(vehicles, new CompareVehiclesByPassengers());

        //Good respect
        System.out.println("Sorted array by passenger capacity:");
        System.out.println();
        for(Passengers vehicle: vehicles){
            System.out.println(vehicle.getClass().getName() + " - " + vehicle.getPassengers());
        }

    }
}
  