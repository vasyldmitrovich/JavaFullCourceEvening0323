package com.softserve.edu06.pt;

public class AppP_6_1 {
    public static void main(String[] args){

       Animal arr[] = new Animal[5];
       arr[0] = new Cat();
       arr[1] = new Cat();
       arr[2] = new Dog();
       arr[3] = new Cat();
       arr[4] = new Dog();


        for (Animal animal : arr) {
            System.out.println(animal.voice()+"  "+ animal.feed());
        }
    }

}
