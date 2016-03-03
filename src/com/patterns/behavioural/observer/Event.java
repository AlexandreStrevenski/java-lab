package com.patterns.behavioural.observer;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class Event extends Observable {

	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date data) {
		this.date = data;
		setChanged();
		notifyObservers(data);
	}
	
	public void addInterested(Observer interested){
		super.addObserver(interested);
	}
	
	public void removeInterested(Observer interested){
		super.deleteObserver(interested);
	}
	
}
