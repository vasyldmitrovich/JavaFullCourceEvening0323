package com.softserve.edu08.pt;

public class Pt08 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department lviv = new Department("Lvivskiy", "Lviv", "Heroiv UPA", 100);
        Department copyOfLviv = (Department) lviv.clone();
        copyOfLviv.address.setCity("Ternopil");

        System.out.println(lviv);
        System.out.println(copyOfLviv);


    }
}
