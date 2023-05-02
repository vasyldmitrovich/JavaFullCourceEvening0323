package com.softserve.edu08.pt08;

public class Department {
    private String name;
    private Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Department(Department department) {
        this.name = department.name;
        this.address = new Address(department.address);
    }

    public Department() {

    }

    public void setCity(String city) {
        this.address.setCity(city);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
    class Address {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public Address(Address address) {
            this.city = address.city;
            this.street = address.street;
            this.building = address.building;
        }

        public void setCity(String city) {
            this.city = city;
        }
        //Why another getters and setters you did not add

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
    }
}
