package com.softserve.edu04.practic.taskFour;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkingWithClassEmployeeTest {
    private static Employee[] employees;

    @BeforeClass
    public static void setDateForClass() {
        employees = new Employee[]{new Employee("Dima", 2, 7400), new Employee("Artur", 5, 6000), new Employee("Nik", 1, 8000), new Employee("Eugen", 2, 9000), new Employee("Anton", 3, 7900),};
    }

    @Test
    public void foundEmployeeForDepartment() {
        Assert.assertEquals(WorkingWithClassEmployee.foundEmployeeForDepartment(2,employees).size(),2);
        Assert.assertNotEquals(WorkingWithClassEmployee.foundEmployeeForDepartment(2,employees).size(),1);
    }

    @Test
    public void sortEmployeesWithSalaryDesc() {
        employees = new Employee[]{
                new Employee("Eugen", 2, 9000),
                new Employee("Nik", 1, 8000),
                new Employee("Anton", 3, 7900),
                new Employee("Dima", 2, 7400),
                new Employee("Artur", 5, 6000),
        };
        Assert.assertArrayEquals(WorkingWithClassEmployee.sortEmployeesWithSalaryDesc(employees),employees);
    }
}