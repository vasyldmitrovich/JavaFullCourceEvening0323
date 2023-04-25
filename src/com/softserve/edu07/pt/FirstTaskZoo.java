package com.softserve.edu07.pt;

public class FirstTaskZoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat("Murchyk");
        animals[1] = new Dog("Sharik");

        for(Animal animal: animals){
            System.out.println(animal.voice());
            System.out.println(animal.feed());
        }
    }
}
