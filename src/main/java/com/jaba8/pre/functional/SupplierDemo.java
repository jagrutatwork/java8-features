package com.jaba8.pre.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String>{
	
	@Override
	public String get() {
		return "Namaskar mitramandali!";
	}

	public static void main(String [] args) {
		
		Supplier<String> supplier = new SupplierDemo();
		
		System.out.println(supplier.get());
		
		Supplier<String> supplier1 = () ->  "Jai Bhim!";

		System.out.println(supplier1.get());
		
		List<String> list = Arrays.asList("Ben 10", "DBZ", "Naruto", "Pokemon");
		
		List<String> list2 = Arrays.asList();
		
		Supplier<List<String>> supplier2 = () -> Arrays.asList("Ben 10", "DBZ", "Naruto", "Pokemon");
		

		System.out.println(supplier2.get());
		
		System.out.println(list.stream().findAny().orElseGet(supplier1));
		
		System.out.println(list.stream().count());
		
		System.out.println(list2.stream().findAny().orElseGet(supplier1));
		
	}
}
