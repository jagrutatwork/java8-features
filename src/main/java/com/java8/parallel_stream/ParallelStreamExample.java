package com.java8.parallel_stream;

import java.util.List;
import java.util.stream.IntStream;

import com.java8.map_reduce.Employee;
import com.java8.map_reduce.EmployeeDatabase;

public class ParallelStreamExample {

	public static void main(String[] args) {

		long start = 0;
		long end = 0;

//		start = System.currentTimeMillis();
//		IntStream.range(1, 100).forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("Time taken by plain stream :" +(end-start));
//		
//		
//		//two ways to create paralell streams:
//		start = System.currentTimeMillis();
//		IntStream.range(1, 100).parallel().forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("Time taken by parallel stream :" +(end-start));

//		IntStream.range(1, 10).forEach(x -> {
//			System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
//		});
//
//		IntStream.range(1, 10).parallel().forEach(x -> {
//			System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
//		});

		List<Employee> employees = EmployeeDatabase.getEmployees();

		System.out.println("using plain stream : ");

		start = System.currentTimeMillis();
		double salaryWithPlainStream = employees.stream().map(Employee::getSalary).mapToDouble(i -> i).average()
				.getAsDouble();
		end = System.currentTimeMillis();

		System.out.println("Time taken by plain stream :" + (end - start)+ " Avg Salary : "+salaryWithPlainStream);

		System.out.println("using parallel stream : ");

		start = System.currentTimeMillis();
		double salaryWithParallelStream = employees.parallelStream().map(Employee::getSalary).mapToDouble(i -> i)
				.average().getAsDouble();
		end = System.currentTimeMillis();

		System.out.println("Time taken by parallel stream :" + (end - start)+ " Avg Salary : "+salaryWithParallelStream);

	}

}
