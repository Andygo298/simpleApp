package com.github.andygo298.calculator;

import com.github.andygo298.calculator.operation.Adder; 

public class AdderCalculator{
	
	public int sum(int... a){
		
		Adder adder = new Adder();
		for(int i:a)
		{
			adder.sum(i);
		}
		return adder.getResult();
	}
}