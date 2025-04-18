package com.java8.map_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);

		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}

		System.out.println(sum);

		int sum1 = numbers.stream().mapToInt(i -> i).sum();
		System.out.println(sum1);

		int num2 = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(num2);

		Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
		System.out.println(reduceSumWithMethodReference.get());

		int prod = numbers.stream().reduce(1, (a, b) -> (a * b));
		System.out.println(prod);

		int greatest = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(greatest);

		int smallest = numbers.stream().reduce(3, (a, b) -> a > b ? b : a);
		System.out.println(smallest);

		Integer greatestWithMethodReference = numbers.stream().reduce(Integer::max).get();
		System.out.println(greatestWithMethodReference);

		List<String> words = Arrays.asList("RestTemplate", "WebClient", "OpenFeign");

		String LongestWord = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)												
				.get();

		System.out.println(LongestWord);

		// ======================Employee Example===============================//

		// get employees whose grade is A
		double avgSalary = EmployeeDatabase.getEmployees().stream().filter(e -> e.getGrade().equalsIgnoreCase("A"))
		.map(e ->e.getSalary()).mapToDouble(i ->i).average().getAsDouble();
		
		System.out.println(avgSalary);
		
		
		double sumSalary = EmployeeDatabase.getEmployees().stream().filter(e -> e.getGrade().equalsIgnoreCase("A"))
				.map(e ->e.getSalary()).mapToDouble(i ->i).sum();
				
		System.out.println(sumSalary);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
