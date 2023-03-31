package com.softserve.edu04.hw;

public class Hw_4_5 {
    public static void main(String[] args) {
        Dog_struct dog1 = new Dog_struct("Rokki", 12, Dog_en.Bre.Breed1.getBrd());
        Dog_struct dog2 = new Dog_struct("Baks", 7, Dog_en.Bre.Breed2.getBrd());
        Dog_struct dog3 = new Dog_struct("Baks", 10, Dog_en.Bre.Breed3.getBrd());


        if (dog1.getName() == dog2.getName() ||
                dog1.getName() == dog3.getName() ||
                dog2.getName() == dog3.getName()) {
            System.out.println("Two or more Dogs heve the same name! ");
        } else {
            System.out.println("All Dogs have individual Names");
        }


        Dog_struct oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }
        System.out.println("Oldest dog is: " + oldestDog.getName() + " and it has " + oldestDog.getBreed() + " Breed");
    }
}





