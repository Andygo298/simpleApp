package com.github.andygo298.helloworld;

import com.github.andygo298.calculator.AdderCalculator;

public class HelloWorld{
	
	public static void main(String[] args){
		
		int operandFirst = 10;
		int operandSecond = 50;
		
		AdderCalculator calc = new AdderCalculator();
		
		System.out.println("Hello World!");
		System.out.println(operandFirst + "+" + operandSecond + "=" + calc.sum(operandFirst,operandSecond));
	}
}