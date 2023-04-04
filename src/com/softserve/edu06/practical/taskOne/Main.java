package com.softserve.edu06.practical.taskOne;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Bob"));
        animals.add(new Dog("Anderson"));
        animals.add(new Dog("Ken"));
        animals.add(new Cat("Milka"));
        animals.add(new Cat("Maks"));
        for(int i=0; i<animals.size(); i++){
            System.out.println(animals.get(i).voice());
            System.out.println(animals.get(i).feed());
        }
    }
}
