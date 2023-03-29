package com.softserve.edu03.homework.taskFive;

import java.util.Arrays;

public class WorkingWithDog {
    public void startWorking() {
        Dog dogOne = new Dog("Pups", Breed.Bulldog, 7);
        Dog dogTwo = new Dog("Mars", Breed.Terrier, 4);
        Dog dogThree = new Dog("Pups", Breed.Beagle, 9);
        if (checkNameDogs(dogOne, dogTwo, dogThree) == true) System.out.println("Dogs have same name");
        foundAndOutputMuchOldDog(dogOne, dogTwo, dogThree);
    }

    private void foundAndOutputMuchOldDog(Dog... dogs) {
        System.out.println(Arrays.stream(dogs).reduce((dog1, dog2) -> dog1.getAge() > dog2.getAge() ? dog1 : dog2).get());
    }

    private boolean checkNameDogs(Dog... dogs) {
        if (dogs.length == 0) return false;
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].equals(dogs[j]) == true) {
                    return true;
                }
            }
        }
        System.out.println("Dogs not have same name");
        return false;
    }
}
