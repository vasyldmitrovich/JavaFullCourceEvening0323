/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu10.pt;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author rgonchar
 */
public class Pt10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Task 1
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Oleg");
        employeeMap.put(2, "Jana");
        employeeMap.put(3, "Olga");
        employeeMap.put(4, "Victor");
        employeeMap.put(5, "Zoi");
        employeeMap.put(6, "Alex");
        employeeMap.put(7, "Lida");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey()
                    + ": "
                    + entry.getValue());
        }
        
        System.out.print("Please input ID (1..7): ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        if(employeeMap.containsKey(id)){
            System.out.println(employeeMap.get(id));
        }else{
            System.out.println("There is no employee with ID " + id);
        }
        System.out.print("Please input a name: ");
        Scanner scName = new Scanner(System.in);
        String name = scName.nextLine();
        if(employeeMap.containsValue(name)){
            for (Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println("ID of " + name + " is: " + entry.getKey());
            }
        }
        }else{
            System.out.println("There is no employee with name " + name);
        }

    }

}
