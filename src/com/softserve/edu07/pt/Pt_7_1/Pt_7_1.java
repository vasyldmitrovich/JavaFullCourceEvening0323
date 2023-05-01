package com.softserve.edu07.pt.Pt_7_1;


public class Pt_7_1 {
    public static void main(String[] args) {
        //Good
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
            System.out.println();
        }
    }
}

