package com.softserve.edu04.hw04;

public class HomeWork05 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", Breed.GOLDEN_RETRIEVER, 5);
        Dog dog2 = new Dog("Max", Breed.PUG, 3);
        Dog dog3 = new Dog("Buddy", Breed.LABRADOR, 7);

        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName())) {
            System.out.println("Two dogs cannot have the same name!");
            return;
        }

        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }

        System.out.println("The name of the oldest dog is " + oldestDog.getName() + " and the breed is " + oldestDog.getBreed().name());
    }

}
