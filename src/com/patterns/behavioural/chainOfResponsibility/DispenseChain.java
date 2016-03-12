package com.patterns.behavioural.chainOfResponsibility;

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);
	void dispense(Currency cur);
	
}
