package com.softserve.edu07.hw.Task2;

public class Bus extends GroundVehicle{
    private String route;

    protected Bus() {
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
    @Override
    protected void drive() {
        System.out.println("I`m bus from ground vehicle and i can drive");
    }
}
