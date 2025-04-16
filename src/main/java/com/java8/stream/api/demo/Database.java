package com.java8.stream.api.demo;

import java.util.ArrayList;
import java.util.List;

//dummy DAO
public class Database {
	
	public static List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(180, "Jagrut", "Java", 40000));
		list.add(new Employee(300, "Pravin", "DotNet", 85000));
		list.add(new Employee(570, "Aryan", "Flutter", 60000));
		list.add(new Employee(150, "Tejas", "Salesforce", 100000));
		list.add(new Employee(233, "Aniket", "Python", 70000));
		return list;
	}

}
