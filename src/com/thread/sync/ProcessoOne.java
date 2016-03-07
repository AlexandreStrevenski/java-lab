package com.thread.sync;

public class ProcessoOne implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Start process One");
			Thread.sleep(2000);
			System.out.println("Finish process One");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
