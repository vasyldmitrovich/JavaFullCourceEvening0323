package com.softserve.edu07.practical;

public class Department {
    private String name;

    private Address address;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
        address = new Address("Kharkiv","Saltivka",24);
    }

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address addressForClone = new Address(address.getCity(),address.getStreet(),address.getBuilding());
        Department departmentCopy = new Department(this.name,addressForClone);
        return departmentCopy;
    }

    //Move this inner class at the end of class Department, after toString()
    public class Address{
        private String city;
        private String street;
        private int building;

        public Address() {
        }

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public Address(String street) {
            city = "Kharkiv";
            building = 50;
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getBuilding() {
            return building;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
