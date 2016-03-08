package com.patterns.behavioural.state;

public class CoffeShop {

	private IState state;
	
	public CoffeShop() {
	}
	
	public CoffeShop(IState state) {
		this.state = state;
	}

	public IState getState() {
		return state;
	}

	public void setState(IState state) {
		this.state = state;
	}

	public String getACoffe(){
		return state.handleState();
	}
	
}
