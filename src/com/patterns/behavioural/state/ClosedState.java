package com.patterns.behavioural.state;

public class ClosedState implements IState {

	@Override
	public String handleState() {
		return "Come back later. We are Closed.";
	}

}
