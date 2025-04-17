package com.java8.map_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
	
	public static List<Customer> getAll() {
		return Stream.of(
				new Customer(101, "john", "john@gmail.com", Arrays.asList("39393939","2773773")),
				new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89393939","8773773")),
				new Customer(103, "peter", "peter@gmail.com", Arrays.asList("39391639","19973773")),
				new Customer(104, "kely", "kely@gmail.com", Arrays.asList("49293939","57377773")),
				new Customer(105, "pam", "pam@gmail.com", Arrays.asList("7773939","4443773"))	
				).collect(Collectors.toList());
	}

}
