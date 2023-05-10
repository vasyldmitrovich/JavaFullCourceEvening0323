package com.softserve.edu08.pt;

public class Department implements Cloneable {
    private String name;
    public Address address = new Address();

    public Department(String name, String city, String street, int buildings) {
        this.name = name;
        address.city = city;
        address.street = street;
        address.buildings = buildings;
    }

    public class Address implements Cloneable {
        private String city, street;
        private int buildings;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address = (Address) copyOfDepartment.address.clone();
        return copyOfDepartment;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", City: " + this.address.city + ", Street: " + this.address.street + ", buildings: " + this.address.buildings;
    }
}
