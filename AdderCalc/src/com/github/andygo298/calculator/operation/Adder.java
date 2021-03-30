package com.github.andygo298.calculator.operation;
	 
public class Adder{
	
	private int result;
		
	public Adder(){
		result = 0;
		}
		
	public Adder(int operand){
		this.result = operand;
	}

	public void sum(int operand){
		result += operand;
	}
		
	public int getResult(){
		return result;
	}
}