package com.softserve.edu07.pt07.task1;

public class PracticalTask01 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Cat();
        animals[2] = new Dog();

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }


}
