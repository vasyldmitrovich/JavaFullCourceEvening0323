package com.softserve.edu06.pt;

abstract class Staff  extends Person{
    public Staff(String name) {
        super(name);
    }

    public abstract int salary();

}
