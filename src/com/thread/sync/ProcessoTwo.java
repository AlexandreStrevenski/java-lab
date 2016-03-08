package com.thread.sync;

public class ProcessoTwo implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Start process Two");
			Thread.sleep(5000);
			System.out.println("Finish process Two");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
