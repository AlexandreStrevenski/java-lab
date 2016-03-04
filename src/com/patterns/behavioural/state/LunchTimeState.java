package com.patterns.behavioural.state;

public class LunchTimeState implements IState {

	@Override
	public String handleState() {
		return "Lunch Time! Would you have a lunch?";
	}

}
