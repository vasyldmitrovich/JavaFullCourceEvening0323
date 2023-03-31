package com.softserve.edu05.practic.taskOne;

public abstract class Computer {
    private static String brand ="Generic";
    public abstract void turnOn();
    public void shutDown() {
        System.out.println("Shutting down computer...");
    }

    public static void printBrand() {
        System.out.println("Computer brand: " + brand);
    }
}

class DesktopComputer extends Computer {
    @Override
    public void turnOn() {
        System.out.println("Turning on desktop computer...");
    }
}

class LaptopComputer extends Computer {

    @Override
    public void turnOn() {
        System.out.println("Turning on laptop computer...");
    }
}

class Main {
    public static void main(String[] args) {
        Computer desktop = new DesktopComputer();
        Computer laptop = new LaptopComputer();
        desktop.turnOn();
        laptop.turnOn();
        desktop.shutDown();
        DesktopComputer.printBrand();
        LaptopComputer.printBrand();
        Computer.printBrand();
    }
}

