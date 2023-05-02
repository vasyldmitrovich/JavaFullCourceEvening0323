package com.softserve.edu09.practical.taskTwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {//In general everything is good
        System.out.println("Map");
        Map<Integer,Employee> employeeMap = fullMap();
        System.out.println(employeeMap);
        System.out.println("Search name in map with id");
        System.out.println("Input id:");
        int idFromUser = scanner.nextInt();
        System.out.println(searchNameWithId(idFromUser,employeeMap));
        System.out.println("Search id in map with name");
        Employee employee = getNewEmployee();
        System.out.println();
        System.out.println(searchIdWithName(employee.getName(),employeeMap,employee.getPosition(),employee.getDateOfBirth(),employee.getSalary()));
        System.out.println();
        System.out.println("You want update data in map?\n1)Yes\n2)No");
        int idOperation = scanner.nextInt();
        if(idOperation == 1){
            System.out.println("Input please id");
            int idForSearch = scanner.nextInt();
            if(searchNameWithId(idForSearch,employeeMap).contains("Key found and his value") == true){//Please del == true
                System.out.println("Input date for update");
                Employee employeeForUpdate = getNewEmployee();
                employeeMap.put(idForSearch,employeeForUpdate);
            }
        }
    }

    private static Employee getNewEmployee(){
        Employee employee = new Employee();
        System.out.println("Input name:");
        employee.setName(scanner.next());
        System.out.println("Input your position");
        employee.setPosition(scanner.nextLine());
        System.out.println("Input your salary");
        double salary = scanner.nextDouble();
        employee.setSalary(salary);
        System.out.println("Input your date of birth:");
        employee.setDateOfBirth(scanner.nextLine());
        return employee;
    }

    private static String searchIdWithName(String name, Map<Integer,Employee> employeeMap, String position, String dateOfBirth, double salary){
        int id = 0;
        Employee employee = new Employee();
        for(Map.Entry<Integer,Employee> map : employeeMap.entrySet()){
            if(map.getValue().getName().equals(name) && map.getValue().getPosition().equals(position) && map.getValue().getDateOfBirth().equals(dateOfBirth) && map.getValue().getSalary() == salary){
                id = map.getKey();
                employee = map.getValue();
            }
        }
        return "Person found and his id = "+id+"\n"+employee;
    }

    private static String searchNameWithId(int id, Map<Integer,Employee> employeeMap){
        if(employeeMap.containsKey(id) == false){
            return "Key not found because function containsKey() = "+employeeMap.containsKey(id);
        }
        Employee employee = new Employee();
        for(Map.Entry<Integer,Employee> map : employeeMap.entrySet()){
            if(map.getKey() == id){
                employee = map.getValue();
            }
        }
        return "Key found and his value = "+employee;
    }

    private static Map<Integer,Employee> fullMap(){
        Map<Integer,Employee> employeeMap = new HashMap<>();
        employeeMap.put(11232,new Employee("Evgen","java developer",30000,"13-03-2002"));
        employeeMap.put(21324,new Employee("Dima","water",15000,"24-06-2005"));
        employeeMap.put(32413, new Employee("Yulya","no working",0,"07-09-2001"));
        employeeMap.put(21378,new Employee("Sanya","doctor",25000,"17-06-2002"));
        employeeMap.put(56547,new Employee("Gleb","artist",10000,"12-01-2005"));
        employeeMap.put(67523,new Employee("Anton","teacher",12000,"30-03-1994"));
        employeeMap.put(45646,new Employee("Tanya","chef",5000,"01-12-1984"));
        return employeeMap;
    }
}
