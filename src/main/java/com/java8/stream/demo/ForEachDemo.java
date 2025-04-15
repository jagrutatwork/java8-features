package com.java8.stream.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {
	
	
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Mika", "Tammy", "Leon", "Sandy", "Jarek", "Ina", "Samuel");
		
//		for(String s: list)
//		{
//			System.out.println(s);
//		}
//
//		list.stream().forEach(s->System.out.println(s));
//
//
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Akkad");
		map.put(2, "Bakkad");
		map.put(3,"Bambey");
		map.put(4,"Bo!");
//
//		map.forEach((amba, ras)->System.out.println(ras));  //amba and ras are aliases for key and value
//
//		map.entrySet().stream().forEach(obj -> System.out.println(obj));
//
//
//		Consumer<String> consumer = (t)-> System.out.println(t);
//
//		for(String s1:list)
//		{
//			consumer.accept(s1);
//		}
//		
		
		//Filter:
		for(String s: list)
		{
			if(s.startsWith("S"))
		{
				System.out.println(s);
						
					}
		}
		
		
		list.stream().filter(s -> s.startsWith("S")).forEach(s-> System.out.println(s));
		
		
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj -> System.out.println(obj));
		
		
	}
	
	
	
	
	
	
	
	

}


