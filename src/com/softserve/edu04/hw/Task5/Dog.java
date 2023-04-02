package com.softserve.edu04.hw.Task5;

public class Dog {
    public String name;
    public int age;
    public Breed breed;

    Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    Dog() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public static String checkName(Dog... dogs) {
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equalsIgnoreCase(dogs[j].getName())) {
                    return "There are dogs with the same name";
                }
            }
        }
        return "All dogs have special name";
    }

    public static Dog oldestDog(Dog... dogs) {
        int maxAge = dogs[0].getAge();
        Dog oldesDog = new Dog();
        for (Dog dog : dogs) {
            if (dog.getAge() >= maxAge) {
                maxAge = dog.getAge();
                oldesDog = dog;
            }
        }
        return oldesDog;
    }
}
