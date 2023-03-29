package com.softserve.edu05.pt;

import java.util.Scanner;

public class Employee {
  private String PIB;
  private int salary;
  private int DepartmentNumber;

  public Employee(String PIB, int salary, int DepartmentNumber) {
    this.PIB = PIB;
    this.salary = salary;
    this.DepartmentNumber = DepartmentNumber;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Employee other = (Employee) obj;
    if (DepartmentNumber != other.DepartmentNumber) return false;

    return true;
  }

  public static void Cdepartment(int DepNubm1, int d) {
    if (DepNubm1 == d) {
      System.out.println();
    }
  }

  @Override
  public String toString() {

    return "Employee{"
            + "PIB='" + PIB
            + ", salary=" + salary
            + ", DepartmentNumber=" + DepartmentNumber
            + '}';
  }

 /* public static void sort(Employee employee,Employee employee1,Employee employee2){
    int b=employee.DepartmentNumber;
    int k=employee1.DepartmentNumber;
    int c=employee2.DepartmentNumber;

    for(int i=0;i<3;i++) {
      if (k > b) {
        System.out.println(employee1.toString());
      }
      if (k < b) {
        System.out.println(employee.toString());
      }
      if (c < b) {
        System.out.println(employee.toString());
      }
    }
  }*/
  public static void main(String[] args) {
    Employee employer1 = new Employee("S.B.B", 30000, 1008);
    Employee employer2 = new Employee("S.B.V", 50000, 1008);
    Employee employer3 = new Employee("S.O.B", 20000, 1007);
    int d;
    Scanner br = new Scanner(System.in);
    d = br.nextInt();

    if(employer1.DepartmentNumber==d){
      System.out.println( employer1.toString());
    }
    if(employer2.DepartmentNumber==d){
      System.out.println( employer1.toString());
    }
    if(employer3.DepartmentNumber==d){
      System.out.println( employer1.toString());
    }




  }
  }
