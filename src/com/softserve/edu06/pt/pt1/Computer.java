package com.softserve.edu06.pt.pt1;

abstract class Computer {
    static String brand ="Generic";
	
	public void turnOn() {
	}
	
	public void shutDown() {
        System.out.println("Shutting down computer...");
    }

    static void printBrand() {
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
        Computer.printBrand();
        desktop.shutDown();
    }
}
