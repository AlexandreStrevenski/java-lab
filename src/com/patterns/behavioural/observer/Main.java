package com.patterns.behavioural.observer;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Event event = new Event();
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		
		event.addInterested(person1);
		event.addInterested(person2);
		
		event.setDate(new Date(System.currentTimeMillis()));
	}
}
