package com.softserve.edu09.homework.taskTwo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Map full name");
        HashMap<String,String> mapFullName = fullMap();
        System.out.println(mapFullName);
        System.out.println("Check map on exist two people with same name");
        System.out.println(checkMapOnName(mapFullName) == true ? "Yes, map have objects with same name" : "No, map not have objects with same name");
        System.out.println("Delete from map where name = Dima");
        mapFullName = removeFromMapWhenName(mapFullName,"Dima");
        System.out.println(mapFullName);
    }

    private static HashMap<String,String> removeFromMapWhenName(HashMap<String,String> mapFullName, String name){
        String key = foundKeyForValue(mapFullName,name).orElse("value not found!");
        if(key.equals("value not found!") == true){
            System.out.println(key);
            return mapFullName;
        }
        mapFullName.remove(key);
        return mapFullName;
    }

    //You use Optional class, good it is good
    private static Optional<String> foundKeyForValue(HashMap<String,String> mapFullName, String name){
        for(Map.Entry<String,String> maps : mapFullName.entrySet()){
            if(maps.getValue().equals(name)){
                return Optional.of(maps.getKey());
            }
        }
        return Optional.empty();
    }
    
    private static boolean checkMapOnName(HashMap<String,String> mapFullName){
        String[] firstName = mapFullName.values().stream().toArray(String[]::new);
        for(int i=0; i < firstName.length; i++){
            for(int j = i+1; j < firstName.length-1; j++){
                if(firstName[i].equals(firstName[j])){
                    return true;
                }
            }
        }
        return false;
    }
    private static HashMap<String,String> fullMap(){
        HashMap<String,String> mapFullName = new HashMap<>();
        mapFullName.put("Brexyn","Evgen");
        mapFullName.put("Rudoi","Dima");
        mapFullName.put("Valentin","Bob");
        mapFullName.put("Basenko","Anton");
        mapFullName.put("Sagin","Sanya");
        mapFullName.put("Sherbak","Tanya");
        mapFullName.put("Rykov","Evgen");
        mapFullName.put("Tatarin","Dima");
        mapFullName.put("Zaborin","Roma");
        mapFullName.put("Borob","Yuilia");
        return mapFullName;
    }
}
