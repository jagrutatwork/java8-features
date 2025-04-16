package com.java8.stream.api.demo;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

	public static List<Employee> evaluateTaxUsers(String input) {

		if (input.equalsIgnoreCase("tax")) {
			return Database.getEmployees().stream().filter(e -> e.getSalary() > 75000).collect(Collectors.toList());
		} else {
			return Database.getEmployees().stream().filter(e -> e.getSalary() < 75000).collect(Collectors.toList());
		}

		// .forEach(e -> System.out.println(e));
	}

	public static void main(String[] args) {
		System.out.println(evaluateTaxUsers("tax"));

		System.out.println(evaluateTaxUsers("non-tax"));

	}

}
