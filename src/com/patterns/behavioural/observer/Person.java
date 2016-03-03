package com.patterns.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {

	@Override
	public void update(Observable o, Object date) {
		System.out.println("New date: " + date);
	}

}
