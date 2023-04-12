/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu07.pt;

/**
 * @author rgonchar
 */
public class Dog implements Animal {
    public Dog() {
    }

    ;

    @Override
    public void feed() {
        System.out.println("Dog eats a bone");
    }

    @Override
    public void voice() {
        System.out.println("Dog says \"Gav!\"");
    }

}
