package com.softserve.edu06.pt;

import java.util.Arrays;
import java.util.Scanner;

public class PracticalTask1 {
    public static void main(String[] args) {
        Computer desktop = new DesktopComputer();
        Computer laptop = new LaptopComputer();
        desktop.turnOn();
        laptop.turnOn();
        desktop.shutDown();
        Computer.printBrand();
    }
}
