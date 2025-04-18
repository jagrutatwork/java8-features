package com.java8.map_reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDatabase {

//	public static List<Employee> getEmployees() {
//		return Stream.of(new Employee(101, "john", "A", 60000),
//				new Employee(102, "peter", "B", 30000),
//				new Employee(103, "mak", "A", 80000),
//				new Employee(104, "kim", "A", 90000),
//				new Employee(105, "json", "C", 15000)).collect(Collectors.toList());
//	}

	public static List<Employee> getEmployees() {

		List<Employee> emp = new ArrayList<>();

		for (int i = 1; i <= 1000; i++) {
			emp.add(new Employee(i, "employee" + i, "A", Double.valueOf(new Random().nextInt(1000 * 100))));

		}

		return emp;

	}

}
