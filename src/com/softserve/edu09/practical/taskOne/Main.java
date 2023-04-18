package com.softserve.edu09.practical.taskOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Map");
        Map<Integer,String> employeeMap = fullMap();
        System.out.println(employeeMap);
        System.out.println("Search name in map with id");
        System.out.println("Input id:");
        int idFromUser = scanner.nextInt();
        if(checkIdInMap(employeeMap,idFromUser) == false){
            System.out.println(searchNameWithId(idFromUser,employeeMap));
        }
        System.out.println("Search id in map with name");
        System.out.println("Input name:");
        String name = scanner.next();
        System.out.println(searchIdWithName(name,employeeMap));

    }

    private static boolean checkIdInMap(Map<Integer,String> employeeMap, int idFromUser){
        for(Map.Entry<Integer, String> entries : employeeMap.entrySet()){
            if(entries.getKey() == idFromUser){
                System.out.println("I can not add because already id exist in map!");
                return true;
            }
        }
        return false;
    }

    private static String searchIdWithName(String name, Map<Integer,String> employeeMap){
        if(employeeMap.containsValue(name) == false){
            return "Key not found because function containsValue() = "+employeeMap.containsValue(name);
        }
        int id = 0;
        for(Map.Entry<Integer,String> map : employeeMap.entrySet()){
            if(map.getValue().equals(name) == true){
                id = map.getKey();
            }
        }
        return "Name found and his id = "+id;
    }

    private static String searchNameWithId(int id, Map<Integer,String> employeeMap){
        if(employeeMap.containsKey(id) == false){
            return "Key not found because function containsKey() = "+employeeMap.containsKey(id);
        }
        String name = null;
        for(Map.Entry<Integer,String> map : employeeMap.entrySet()){
            if(map.getKey() == id){
                name = map.getValue();
            }
        }
        return "Key found and his value = "+name;
    }

    private static Map<Integer,String> fullMap(){
        Map<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(11232,"Evgen");
        employeeMap.put(21324,"Dima");
        employeeMap.put(32413, "Yulya");
        employeeMap.put(21378,"Sanya");
        employeeMap.put(56547,"Gleb");
        employeeMap.put(67523,"Anton");
        employeeMap.put(45646,"Tanya");
        return employeeMap;
    }
}
