package com.softserve;

import java.util.Arrays;

public class TestApp {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

    public static int doubleNumber(int number) {
        return number * 2;
    }

    public static void main(String[] args) {
        System.out.println(getVolumeOfCuboid(6.3, 2, 5));
    }
}
