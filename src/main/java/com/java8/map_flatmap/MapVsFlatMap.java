package com.java8.map_flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {

		List<Customer> customers = EkartDataBase.getAll();

		// Data transformation
		List<String> emails = customers.stream().map(c -> c.getEmail()).collect(Collectors.toList());
		System.out.println(emails);

		List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(phoneNumbers);

		// Flatenning
		List<String> phones = customers.stream().flatMap(c -> c.getPhoneNumbers().stream())
				.collect(Collectors.toList());

		System.out.println(phones);

	}

}
 