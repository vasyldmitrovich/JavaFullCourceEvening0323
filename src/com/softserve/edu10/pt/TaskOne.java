package com.softserve.edu10.pt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskOne {
	private static String getValueById(Map<Integer, String> map, int id) {
		if (!map.containsKey(id)) {
			return "Such id doesn't exist.";
		}
		return "Employee name is " + map.get(id);
	}
	
	private static String getIdByValue(Map<Integer, String> map, String value) {
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				return "Employee id is " + entry.getKey().toString();
			}
		}
		return "Such name doesn't exist.";
	}
	
	private static int getInputId(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextInt();
	}
	
	private static String getInputName(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextLine();
	}
	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(1, "Jane");
		employeeMap.put(2, "Anna");
		employeeMap.put(3, "Tom");
		employeeMap.put(4, "Peter");
		employeeMap.put(5, "John");
		employeeMap.put(6, "Sam");
		employeeMap.put(7, "Fiona");
		System.out.println(employeeMap);
		int id = TaskOne.getInputId("Enter ID: ");
		System.out.println(TaskOne.getValueById(employeeMap, id));
		String name = TaskOne.getInputName("Enter name: ");
		System.out.println(TaskOne.getIdByValue(employeeMap, name));
	}
}
