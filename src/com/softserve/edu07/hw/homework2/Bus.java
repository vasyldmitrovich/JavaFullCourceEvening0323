package com.softserve.edu07.hw.homework2;

public class Bus extends GroundVehicle {

    private String route;

    public Bus() {
    }

    public Bus(String route) {
        this.route = route;
    }

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
    public void drive() {
        System.out.println(this + " is driving...");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengers=" + getPassengers() +
                ", route='" + route + '\'' +
                '}';
    }
}
