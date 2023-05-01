package com.softserve.edu07.pt;

abstract class Staff  extends Person{
    public Staff(String name) {
        super(name);
    }

    //The same with this method, del public and abstract
    public abstract int salary();

}
