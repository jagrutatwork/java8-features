package com.java8.map_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static Customer getCustomerByEmailId(String email) {
		List<Customer> customers = EkartDataBase.getAll();
		return customers.stream().filter(c -> c.getEmail().equals(email)).findAny().orElse(new Customer());
		//return null;
	}

	public static void main(String[] args) {

		Customer customer = new Customer(101, "john", "john@gmail.com", Arrays.asList("39393939", "2773773"));

		// empty
		// of
		// nullable
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);

//		Optional<String> emailOptional = Optional.of(customer.getEmail());
//		//Use Optional.of when we are sure the value passed wont be null
//		System.out.println(emailOptional);

		Optional<String> emailOptional1 = Optional.ofNullable(customer.getEmail());
		// Use Optional.of when we are not sure the value passed wont be null
		System.out.println(emailOptional1);

		//System.out.println(emailOptional1.get());
		// this above get method gives NoSuchElementException instead of NPE
		// HENCE IT IS RECOMMENDED TO USE THE FOLLOWING CHECK
		if (emailOptional1.isPresent()) {
			System.out.println(emailOptional1.get());
		}

		// System.out.println(emailOptional1.orElse("default@gmail.com"));

		System.out.println(emailOptional1.orElseThrow(() -> new IllegalArgumentException("Enail not present")));

		System.out.println(emailOptional1.map(String::toUpperCase).orElseGet(() -> "default email is..."));
		
		//=======================================================================================================//
		
		getCustomerByEmailId("pqr");
	}

}
