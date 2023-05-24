package com.softserve.edu04.hw;

//Name without ending ***s
public enum Breed {

    FRENCH_BULLDOG("French bulldog"),
    LABRADOR("Labrador"),
    ROTTWEILER("Rottweiler"),
    BEAGLE("Beagle"),
    HUSKY("Husky"),
    CHIHUAHUA("Chihuahua"),
    AKITA_INU("Akita inu");

    private String name;
    private Breed(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

}
