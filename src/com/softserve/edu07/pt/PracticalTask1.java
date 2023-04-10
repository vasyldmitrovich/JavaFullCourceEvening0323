package com.softserve.edu07.pt;

import com.softserve.edu06.pt.Computer;
import com.softserve.edu06.pt.DesktopComputer;
import com.softserve.edu06.pt.LaptopComputer;

import java.sql.SQLOutput;

public class PracticalTask1 {
    public static void main(String[] args) {
        Animal animals[] = new Animal[4];
        animals[0] = new Cat("Фауст");
        animals[1] = new Dog("Ріккі");
        animals[2] = new Cat("Грета");
        animals[3] = new Dog("Лакі");

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}
