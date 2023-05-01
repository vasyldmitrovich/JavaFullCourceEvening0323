package com.softserve.edu08.hw;

import com.softserve.edu08.pt.Department;

public class FullName extends Person implements Cloneable{
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String activity() {
        return null;
    }

    @Override
    public FullName clone() throws CloneNotSupportedException {
        FullName cloned = (FullName) super.clone();
        return cloned;
    }

}
