package com.softserve.edu06.homework.taskTwo;

public class Bus extends GroundVehicle{
    private String route;

    public Bus() {
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("I am bus and i can ride!");
    }
}
