package com.java8.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.java8.stream.api.demo.Employee;

public class SortMapDemo {
	
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		
		
		//if we want to preserve order right from the start we could have used a treeMap
		//but we are using a HashMap so that we can learn sorting on unsorted Map
		
		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		
		
		//TRADITIONAL APROACH:
//		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
//			
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
//			{
//				return o1.getKey().compareTo(o2.getKey());
//			}
//		});
//		
//		for (Entry<String, Integer> entry: entries) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
		Collections.sort(entries, (o1,o2) ->  o1.getKey().compareTo(o2.getKey()));
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(k -> System.out.println(k));
		
		System.out.println("=======");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(k -> System.out.println(k));
		

		System.out.println("=======");
//		
//		Map<Employee, Integer> employeeMap =  new TreeMap<>();
//		
//		employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
//		employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
//		employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
//		employeeMap.put(new Employee(624, "Sourav", "CORE", 40000), 40);
//		employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 120000), 120);
		
		
		
		//traditional approach:
//
//		Map<Employee, Integer> employeeMap =  new TreeMap<>(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return (int) (o1.getSalary() - o2.getSalary());
//			}
//			
//		});
		
		
		//using lambda:
		Map<Employee, Integer> employeeMap =  new TreeMap<>((o1,o2) ->  (int) (o2.getSalary() - o1.getSalary()));
	
		
		employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
		employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
		employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
		employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);
		
		System.out.println(employeeMap);
		
		
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
