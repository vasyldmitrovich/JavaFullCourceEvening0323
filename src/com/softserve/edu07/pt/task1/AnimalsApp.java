package com.softserve.edu07.pt.task1;

public class AnimalsApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.voice();
        cat.feed();

        dog.voice();
        dog.feed();
    }
}
