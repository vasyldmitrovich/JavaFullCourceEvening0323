package com.softserve.edu07.hw;

import java.util.Comparator;

public class CompareVehiclesByPassengers implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Passengers vehicle1 = (Passengers) o1;
        Passengers vehicle2 = (Passengers) o2;
        return -1 * Integer.compare(vehicle1.getPassengers(),vehicle2.getPassengers());
    }
}
