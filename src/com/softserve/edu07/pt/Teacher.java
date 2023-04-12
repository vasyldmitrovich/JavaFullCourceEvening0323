/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu07.pt;

/**
 * @author rgonchar
 */
public class Teacher extends Staff {
    final String TYPE_PERSON = "Teacher";

    public Teacher() {
        System.out.println(this.TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am teacher.");
    }

    @Override
    void salary() {
        System.out.println("Teacher salary: 100");
    }
}
