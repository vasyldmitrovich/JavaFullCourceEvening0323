package com.softserve.edu07.practical;

public class Main {
    public static void main(String[] args) {
        Department department = new Department("StarDepartment",new Department().new Address("Odessa","SeaStreet",20));
        System.out.println(department);
        Department departmentCopyNew = null;
        try{
            departmentCopyNew = (Department) department.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        departmentCopyNew.getAddress().setCity("Kiev");
        System.out.println(department);
        System.out.println(departmentCopyNew);
    }
}
