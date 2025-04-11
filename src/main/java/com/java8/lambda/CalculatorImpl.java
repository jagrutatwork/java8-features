package com.java8.lambda;

interface Calculator {
//	void switchOn();
//	void sum(int input);
	
	int subtract(int n1, int n2);
}

public class CalculatorImpl {
         
   
    
    public static void main(String args[]) {
    	
    	//No param
//    	Calculator calculate = () -> System.out.println("My first anonymous function!");
//    	
//    	calculate.switchOn();
    	
    	//Single param
//    int input = 8; 
//    	Calculator calculate = (in) -> System.out.println(in);
//    	
//    	calculate.sum(input);
    	
    	//Multiple params and return type
    	Calculator calculate = (n1, n2) -> 
    	{
    		if(n2>n1)
    			throw new RuntimeException("Second number is larger!");
    		else
    			return n1-n2;
    	};
    	
    	System.out.print(calculate.subtract(8, 3));
    	System.out.print(calculate.subtract(8, 30));
    }
} 

