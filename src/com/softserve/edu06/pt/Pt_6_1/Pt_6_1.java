package com.softserve.edu06.pt.Pt_6_1;

class Pt_6_1 {
    public static void main(String[] args) {
        Computer desktop = new DesktopComputer();
        Computer laptop = new LaptopComputer();
        desktop.turnOn();
        laptop.turnOn();
        desktop.shutDown();
        Computer.printBrand();
    }
}
