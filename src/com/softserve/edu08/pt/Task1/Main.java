package com.softserve.edu08.pt.Task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {//Well done
        Department department1 = new Department("field", "kiev", "Khreshchatyk", 50);
        System.out.println(department1);
        Department department2 = (Department) department1.clone();
        department2.getAddress().setCity("Ivano-Frankivsk");
        System.out.println(department2);
    }
}

