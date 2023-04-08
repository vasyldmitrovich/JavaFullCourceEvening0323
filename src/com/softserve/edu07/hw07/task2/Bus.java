package com.softserve.edu07.hw07.task2;

public class Bus extends GroundVehicle{
    String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {
        super.drive();
    }
}
