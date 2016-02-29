package com.thread.notify;

/*
 * This is a example how works notify method.
	The result should be:
 * 	
 * 		begin processOne
 * 		step 1 of processOne
 * 		finish step 1 from processOne.
 * 		finish main thread.
 * 		step 2 of processOne
 * 		finish processOne
 */

public class Main {

	public static void main(String[] args) throws InterruptedException {
		//Create an instance of processOne which is a thread.
		ProcessOne processOne = new ProcessOne();
		
		//start the process (run() method).
		processOne.start();

		synchronized (processOne) {
			//Wait the process notify.
			processOne.wait();
			System.out.println("finish step 1 from processOne.");
		}
		
		System.out.println("finish main thread.");
	}

}
