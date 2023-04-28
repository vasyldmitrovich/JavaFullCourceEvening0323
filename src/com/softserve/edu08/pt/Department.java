package com.softserve.edu08.pt;

public class Department implements Cloneable{
    private String name;
    private Address address = new Address();

    public Department() {
    }

    public Department(String name, String city, String street, int building) {
        this.name        = name;
        address.city     = city;
        address.street   = street;
        address.building = building;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address.toString();
    }

    public void setAddress(String city, String street, int building) {
        address.city     = city;
        address.street   = street;
        address.building = building;
    }

    public void setCity(String city){
        address.city = city;
    }

    public void setStreet(String street){
        address.street = street;
    }

    public void setBuilding(int building){
        address.building = building;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address = (Address) address.clone();
        return copyOfDepartment;
    }

    @Override
    public String toString() {
        return String.format("%s department in %s", name, address.toString());
    }

    private class Address implements Cloneable{
        private String city;
        private String street;
        private int building;

        public Address(){}

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return city + " city, " + street + " str., " + building;
        }
    }
}
