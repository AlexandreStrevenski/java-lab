package com.patterns.structural.decorator;

public class MobileDecorator implements Mobile {

	private Mobile mobile;
	
	public MobileDecorator(Mobile mobile){
		this.mobile = mobile;
	}
	
	@Override
	public void turnOn() {
		this.mobile.turnOn();
	}

}
