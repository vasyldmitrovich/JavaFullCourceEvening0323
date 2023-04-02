package com.softserve.edu04.hw;

public class Dog {
    private String name;
    private Breeds breed;
    private int age;

    public Dog(){}

    public Dog(String name, Breeds breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void steName(String name){
        this.name = name;
    }

    public void setBreed(Breeds breed){
        this.breed = breed;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public Breeds getBreed(){
        return breed;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Dog [name: " + name + "; breed: " + breed + "; age: " + age + "]";
    }

    @Override
    public boolean equals(Object object){
        if(this == object)return true;
        if(object == null)return false;
        if(getClass() != object.getClass())return false;
        Dog dog = (Dog) object;
        if (name == null){
            if(dog.getName() != null)return false;
        } else if(!(name.equals(dog.getName()))){
            return false;
        }
        if(age == 0){
            if(dog.getAge() != 0)return false;
        } else if(!(age == dog.getAge())){
            return false;
        }
        return true;
    }

}
