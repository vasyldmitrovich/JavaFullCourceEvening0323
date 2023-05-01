/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu06.hw;

/**
 * @author rgonchar
 */
public class Hw06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //If you finished implement logic, that means you must delete TO DO
        Employee emp = new Employee("Oleg", 32, 60000.00);
        Developer dev = new Developer("Masha", 22, 80000.00, "HR");
        System.out.println(emp.report());
        System.out.println(dev.report());
    }

}
