package com.softserve.edu04.hw;

public class FifthTaskDogInfo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sharik",Breeds.ROTTWEILER,5);

        Dog dog2 = new Dog();
        dog2.steName("Charlik");
        dog2.setBreed(Breeds.CHIHUAHUA);
        dog2.setAge(3);

        Dog dog3 = new Dog("Rambo",Breeds.LABRADOR,4);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        if(dog1.getName().equals(dog2.getName())){
            System.out.println("Dog 1, named " + dog1.getName() + " and dog 2, named "
                    + dog2.getName() + " have the same names.");
        } else if(dog1.getName().equals(dog3.getName())) {
            System.out.println("Dog 1, named " + dog1.getName() + " and dog 3, named "
                    + dog3.getName() + " have the same names.");
        } else if(dog2.getName().equals(dog3.getName())) {
            System.out.println("Dog 2, named " + dog2.getName() + " and dog 3, named "
                    + dog3.getName() + " have the same names.");
        } else {
            System.out.println("There are no dogs with the same names :(");
        }
    }
}
