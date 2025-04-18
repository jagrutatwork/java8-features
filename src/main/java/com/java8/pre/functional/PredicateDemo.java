package com.java8.pre.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if(t%2 == 0)
		return true;
		return false;
	}
	
	
	public static void main(String args[])
	{
		//Traditional
//		Predicate<Integer> predicateDemo = new PredicateDemo();
//		int num = 12;
//		
//		System.out.println(num+" is an even number: "+predicateDemo.test(num));
//		
//		
//		//Lambda
//		Predicate<Integer> predicate = (t) -> (t%2 == 0);
//			
//		num = 6;
//		
//		System.out.println(num+" is an even number: "+predicate.test(num));
		
		//or
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		
//		 list1.stream().forEach(n -> System.out.println(n+" is an even number: "+predicate.test(n)));
//		
//		 System.out.println();
//		 
//		 list1.stream().filter(predicate).forEach(i -> System.out.println(i));
//		 
//
//		 System.out.println();
		
		 list1.stream().filter(i -> i%2 == 0).forEach(i -> System.out.println(i));
		 
	}
	
	
	

}
 