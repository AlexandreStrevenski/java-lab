package com.patterns.behavioural.chainOfResponsibility;

import java.util.Scanner;

public class ATMDispenseChain {

	private DispenseChain c1;

	public ATMDispenseChain() {
		// initialize the chain
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();

		int amount1 = 30;
		atmDispenser.c1.dispense(new Currency(amount1));
		System.out.println("----------");
		int amount2 = 50;
		atmDispenser.c1.dispense(new Currency(amount2));
		System.out.println("----------");
		int amount3 = 100;
		atmDispenser.c1.dispense(new Currency(amount3));
	}

}
