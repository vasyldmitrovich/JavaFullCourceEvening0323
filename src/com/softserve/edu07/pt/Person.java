package com.softserve.edu07.pt;

abstract class Person {
    public String name;

    //Word abstract do not need, java put abstract and public to this method automatic
     abstract void print();

    public Person(String name) {
        this.name = name;
    }

}
