/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu07.pt;

/**
 * @author rgonchar
 */
public class Cat implements Animal {

    public Cat() {
    }

    ;

    @Override
    public void feed() {
        System.out.println("Cat eats a fish");
    }

    @Override
    public void voice() {
        System.out.println("Cat says \"Myau!\"");
    }

}
