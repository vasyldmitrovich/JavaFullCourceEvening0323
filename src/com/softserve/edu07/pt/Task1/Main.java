package com.softserve.edu07.pt.Task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal[] array = {cat,dog};

        for (Animal animal : array){
            animal.voice();
            animal.feed();
        }
    }
}
