package com.softserve.edu07.hw.Hw_7_2;

public class Bus extends GroundVehicle{


    private String route;

    public Bus(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Can be driven");
    }
}
