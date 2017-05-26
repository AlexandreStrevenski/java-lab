package com.patterns.behavioural.templateMethod;

public abstract class AbstractClass {

	public void templateMethod(){
		
		System.out.println("Start template method");
		operationOne();
		System.out.println("midle template method");
		operationTwo();
		System.out.println("finish template method");
	}

	//teste-1	

	public abstract void operationOne();
	public abstract void operationTwo();
	
}
