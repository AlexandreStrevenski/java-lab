package com.patterns.structural.decorator;

public class InitialTask extends MobileDecorator {

	public InitialTask(Mobile mobile) {
		super(mobile);
	}
	
	@Override
	public void turnOn() {
		super.turnOn();
		System.out.println("Initial Task");
	}

}
