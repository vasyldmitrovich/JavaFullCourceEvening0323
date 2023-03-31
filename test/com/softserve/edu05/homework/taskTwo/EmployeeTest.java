package com.softserve.edu05.homework.taskTwo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee employee;
    private Developer developer;

    @Before
    public void setDateForTest(){
        employee = new Employee("Anton",20,5000);
        developer = new Developer("Bob",25,25000,"Senior Java Developer");
    }
    @Test
    public void report() {
        Assert.assertEquals(employee.report(), "Name: Anton, Age: 20,Salary: ₴ 5000.00");
        Assert.assertEquals(developer.report(),"Name: 25000.0, Age: 25, Position: Senior Java Developer, Salary: 25000.0");
        Assert.assertNotEquals(employee.report(),developer.report());
    }
}