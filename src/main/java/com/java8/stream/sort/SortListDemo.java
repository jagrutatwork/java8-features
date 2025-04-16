package com.java8.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.stream.api.demo.Database;
import com.java8.stream.api.demo.Employee;

public class SortListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
//
//		Collections.sort(list);
//		System.out.println(list);
//		
//		Collections.reverse(list);
//		System.out.println(list);
//		
//		//Using Streams
//		
//		list.stream().sorted().forEach(s->System.out.println(s));
//		
//		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
//		
		
		List<Employee> employees = Database.getEmployees();
		
//		Collections.sort(employees, new MyComparator());
		
		//Anonymous
		//Ascending
		Collections.sort(employees, new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return (int) (o1.getSalary()-o2.getSalary());
			}
	
			
		});
		System.out.println(employees);
		
		//Descending
		Collections.sort(employees, new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int)(o2.getSalary()-o1.getSalary());
			}
		});
		
 		System.out.println(employees);


	    //Using lambdas
 		//Ascending
 		System.out.println("Using lanbdas");
	    Collections.sort(employees, (o1, o2) -> (int)(o1.getSalary() - o2.getSalary()));
		employees.stream().forEach(e -> System.out.println(e));
		
		//Descending
		Collections.sort(employees, (o1,o2)->(int)(o2.getSalary()-o1.getSalary()));
		employees.stream().forEach(e -> System.out.println(e));
		
		//Practice comparable, comparator
		
	}
	
}


//
//class MyComparator implements Comparator<Employee>{
//	
//	
//	@Override
//	public int compare(Employee o1, Employee o2)
//	{
//		return (int) (o1.getSalary()-o2.getSalary());
//	}
//	
//	
//}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	