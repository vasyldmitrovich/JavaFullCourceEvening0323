/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu07.pt;

/**
 * @author rgonchar
 */
public abstract class Staff extends Person {

    abstract void salary();

    @Override
    void print() {
        System.out.println("I am staff");
    }

}
