package com.thread.sync;

public class SyncMain {

	public static void main(String[] args) throws InterruptedException {
		Thread processOne = new Thread(new ProcessoOne());
		Thread processTwo = new Thread(new ProcessoTwo());
		
		//Process One takes 2 seconds.
		processOne.start();
		
		//Process Two takes 5 seconds.
		processTwo.start();

		processOne.join();
		processTwo.join();
		
		System.out.println("Finish main method");
	}

}
