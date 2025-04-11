package com.java8.lambda;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	void m1();

	
	default void m2() {
		System.out.println("Default Method-1");
	}
	
	default void m3() {
		System.out.println("Default Method-2");
	}
	
	static void m4() {
		System.out.println("Static Method-3");
	}

}
