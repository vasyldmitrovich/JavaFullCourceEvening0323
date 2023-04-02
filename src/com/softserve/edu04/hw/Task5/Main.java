package com.softserve.edu04.hw.Task5;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bro", 5, Breed.HUSKY);
        Dog dog2 = new Dog("Bob", 2, Breed.AKITA);
        Dog dog3 = new Dog("Sparky", 3, Breed.RETRIEVERS);
        System.out.println(Dog.checkName(dog1, dog2, dog3));
        Dog oldesDog = Dog.oldestDog(dog1, dog2, dog3);
        System.out.println("The oldest dog is " + oldesDog.getName() + " and his breed is " + oldesDog.getBreed().getBreedName());

    }
}
