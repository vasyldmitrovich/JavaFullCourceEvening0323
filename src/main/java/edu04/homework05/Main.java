package edu04.homework05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog[] arrayOfDogs = new Dog[3];
        arrayOfDogs[0] = new Dog("Bux", Breed.SPITZ, 4);
        arrayOfDogs[1] = new Dog("Brendon", Breed.LABRADOR, 10);
        arrayOfDogs[2] = new Dog("Bux", Breed.MALTIPU, 1);
        System.out.println("Same names there are " + searchSameNames(arrayOfDogs));
        System.out.println("The oldest dog " + searchTheOldest(arrayOfDogs));
    }

    private static boolean searchSameNames(Dog[] arrays) {
        boolean searchSame = false;
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[0].getName().equals(arrays[i].getName())) {
                searchSame = true;
            }
        }
        return searchSame;
    }

    private static String searchTheOldest(Dog[] arrays) {
        Dog dogTemp = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            if (dogTemp.getAge() < arrays[i].getAge()) {
                dogTemp = arrays[i];
            }
        }
        return dogTemp.getName();
    }
}
