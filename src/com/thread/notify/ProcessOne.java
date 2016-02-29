package com.thread.notify;

public class ProcessOne extends Thread {

	@Override
	public void run() {
		try {
			synchronized (this) {
				System.out.println("begin processOne");
				Thread.sleep(3000);
				System.out.println("step 1 of processOne");
				notify(); //Tell main thread that our job is done.
			}
			Thread.sleep(4000); //Do something else
			System.out.println("step 2 of processOne");
			System.out.println("finish processOne");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
