/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu07.pt;

/**
 * @author rgonchar
 */
public class Cleaner extends Staff {
    final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
        System.out.println(this.TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am cleaner.");
    }

    @Override
    void salary() {
        System.out.println("Cleaner salary: 50");
    }

}
