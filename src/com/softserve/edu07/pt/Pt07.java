/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu07.pt;

/**
 * @author rgonchar
 */
public class Pt07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Delete TO DO and use loop there
        Dog dog = new Dog();
        dog.feed();
        dog.voice();

        Cat cat = new Cat();
        cat.feed();
        cat.voice();

        Person[] persons = {
                new Teacher(),
                new Cleaner(),
                new Student()
        };
        for (Person p : persons) {
            p.print();
            if (p instanceof Teacher) {
                ((Teacher) p).salary();
            } else if (p instanceof Cleaner) {
                ((Cleaner) p).salary();
            }
        }
    }

}
