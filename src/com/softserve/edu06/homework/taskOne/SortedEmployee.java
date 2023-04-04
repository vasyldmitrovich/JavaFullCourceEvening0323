package com.softserve.edu06.homework.taskOne;

import java.util.Comparator;

public class SortedEmployee implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if(emp1 instanceof SalariedEmployee && emp2 instanceof SalariedEmployee){
            return ((SalariedEmployee)emp1).calculatePay() > ((SalariedEmployee)emp2).calculatePay() ? -1 : ((SalariedEmployee)emp1).calculatePay() == ((SalariedEmployee)emp2).calculatePay() ? 0 : 1;
        }
        else if(emp1 instanceof ContractEmployee && emp2 instanceof ContractEmployee){
            return ((ContractEmployee)emp1).calculatePay() > ((ContractEmployee)emp2).calculatePay() ? -1 : ((ContractEmployee)emp1).calculatePay() == ((ContractEmployee)emp2).calculatePay() ? 0 : 1;
        }
        else if(emp1 instanceof SalariedEmployee && emp2 instanceof ContractEmployee){
            return ((SalariedEmployee)emp1).calculatePay() > ((ContractEmployee)emp2).calculatePay() ? -1 : ((SalariedEmployee)emp1).calculatePay() == ((ContractEmployee)emp2).calculatePay() ? 0 : 1;
        }else {
            return ((ContractEmployee)emp1).calculatePay() > ((SalariedEmployee)emp2).calculatePay() ? -1 : ((ContractEmployee)emp1).calculatePay() == ((SalariedEmployee)emp2).calculatePay() ? 0 : 1;
        }
    }
}
