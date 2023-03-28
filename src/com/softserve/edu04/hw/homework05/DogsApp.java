package com.softserve.edu04.hw.homework05;

public class DogsApp {
    public static void main(String[] args) {

        // Create three instances of type Dog
        Dog dog1 = new Dog("Robbie", 5, Breed.GOLDEN_RETRIEVER);
        Dog dog2 = new Dog("Daniel", 7, Breed.DALMATIAN);
        Dog dog3 = new Dog("Sunny", 6, Breed.NEWFOUNDLAND);

        // Check if there are no two dogs with the same name
        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName())
                || dog2.getName().equals(dog3.getName())) {
            System.out.println("There are dogs with the same name");
        } else {
            System.out.println("There are no dogs with the same name");
        }

        // Output the name and the breed of the oldest dog
        Dog[] dogs = {dog1, dog2, dog3};
        int maxAge = dog1.getAge();
        Dog oldestDog = dog1;
        for(int i = 1; i < dogs.length; i++) {
            if (dogs[i].getAge() > maxAge) {
                maxAge = dogs[i].getAge();
                oldestDog = dogs[i];
            }
        }
        System.out.println("Oldest dog is: " + oldestDog.toString());
    }
}
