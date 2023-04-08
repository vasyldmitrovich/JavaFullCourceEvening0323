package com.softserve.edu07.hw07.hw1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Employee employee[] = new Employee[6];
        employee[0] = new ContractEmployee("12345", 30000, "Ivan Ivanov");
        employee[1] = new ContractEmployee("12785", 42000, "Dmytro Makarenko");
        employee[2] = new ContractEmployee("16745", 54000, "Mykyta Nichkarenko");
        employee[3] = new SalariedEmployee("Kyrylo Dimidenko", 50, 900, "16789");
        employee[4] = new SalariedEmployee("Nazar Hmyrko", 45, 910, "14569");
        employee[5] = new SalariedEmployee("Stanislav Perechko", 42, 890, "19769");
        for (int i = 3; i < employee.length; i++) {
            ((SalariedEmployee) employee[i]).calculatePay();
        }
        for (int i = 0; i < 3; i++) {
            ((ContractEmployee) employee[i]).setSalary(((ContractEmployee) employee[i]).calculatePay());
        }
        List<ContractEmployee> employeeList = new ArrayList<>();
        employeeList.add((ContractEmployee) employee[0]);
        employeeList.add((ContractEmployee) employee[1]);
        employeeList.add((ContractEmployee) employee[2]);
        employeeList.add(new ContractEmployee(((SalariedEmployee) employee[3]).getSocialSecurityNumber(), ((SalariedEmployee) employee[3]).getSalary(), employee[3].getEmployed()));
        employeeList.add(new ContractEmployee(((SalariedEmployee) employee[4]).getSocialSecurityNumber(), ((SalariedEmployee) employee[4]).getSalary(), employee[4].getEmployed()));
        employeeList.add(new ContractEmployee(((SalariedEmployee) employee[5]).getSocialSecurityNumber(), ((SalariedEmployee) employee[5]).getSalary(), employee[5].getEmployed()));
        employeeList.stream().sorted(Comparator.comparingInt(ContractEmployee::getSalary).reversed()).collect(Collectors.toList()).forEach(System.out::println);
    }
}


//    зробила для особистои практики, щоб зрозумiти що пiд капотом
//    public static class CompareEmployee implements Comparator<Employee>{
//
//        @Override
//        public int compare(Employee o1, Employee o2) {
//            if (o1 instanceof SalariedEmployee && o2 instanceof SalariedEmployee){
//                return ((SalariedEmployee) o1).getSalary()>((SalariedEmployee) o2).getSalary()?-1:
//                        ((SalariedEmployee) o1).getSalary()==((SalariedEmployee) o2).getSalary()?0:1;
//            }
//            if (o1 instanceof ContractEmployee && o2 instanceof ContractEmployee)
//            {
//                return ((ContractEmployee) o1).getSalary()>((ContractEmployee) o2).getSalary()?-1:
//                        ((ContractEmployee) o1).getSalary()==((ContractEmployee) o2).getSalary()?0:1;
//            }
//            if (o1 instanceof SalariedEmployee && o2 instanceof ContractEmployee)
//            {
//                return ((SalariedEmployee) o1).getSalary()>((ContractEmployee) o2).getSalary()?-1:
//                        ((SalariedEmployee) o1).getSalary()==((ContractEmployee) o2).getSalary()?0:1;
//            }
//        else return ((ContractEmployee) o1).getSalary()>((SalariedEmployee) o2).getSalary()?-1:
//                    ((ContractEmployee) o1).getSalary()==((SalariedEmployee) o2).getSalary()?0:1;}
//    }


