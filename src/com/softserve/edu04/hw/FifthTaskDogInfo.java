package com.softserve.edu04.hw;

public class FifthTaskDogInfo {
    public static void main(String[] args) {

        Dog[] dogs = getAnArrayOfDogs();
        printAnArray(dogs);
        searchTheSameName(dogs);

        //Logic like this move to method and in this method make condition, in method put array of Dogs, and use loop in method

    }

    public static Dog[] getAnArrayOfDogs(){
        Dog[] dogs = new Dog[3];

        Dog dog1 = new Dog("Sharik", Breed.ROTTWEILER,5);
        dogs[0] = dog1;

        Dog dog2 = new Dog();
        dog2.steName("Charlik");
        dog2.setBreed(Breed.CHIHUAHUA);
        dog2.setAge(3);
        dogs[1] = dog2;

        Dog dog3 = new Dog("Rambo", Breed.LABRADOR,4);
        dogs[2] = dog3;

        return dogs;
    }

    public static void printAnArray(Dog[] dogs){
        for(Dog d: dogs){
            System.out.println(d);
        }
    }

    public static void searchTheSameName(Dog[] dogs){
        boolean foundSameName = false;
        for(int i = 0; i < dogs.length - 1; i++){
            for(int j = i + 1; j < dogs.length; j++){
                if(dogs[i].getName().equals(dogs[j].getName())){
                    foundSameName = true;
                    System.out.format("Dog %d, named %s and dog %d, named %s have the same names.\n", dogs[i],dogs[i].getName(),
                            dogs[j], dogs[j].getName());
                }
            }
        }
        if(!foundSameName){
            System.out.println("There are no dogs with the same names :(");
        }
    }
}
