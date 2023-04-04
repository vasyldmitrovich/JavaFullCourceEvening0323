package com.softserve.edu06.homework.taskOne;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("AFF32","Bob",3.45,450,"N321234");
        employees[1] = new ContractEmployee("BQW12","Anton",6000,"235412");
        employees[2] = new ContractEmployee("MBW21","Eugen",15000,"451009");
        employees[3] = new SalariedEmployee("MER67","Sanya",4.56,560,"N456712");
        employees[4] = new SalariedEmployee("ZER89","Dima",2.98,710,"N234512");
        Arrays.stream(employees).sorted(new SortedEmployee()).forEach(System.out::println);
    }
}
