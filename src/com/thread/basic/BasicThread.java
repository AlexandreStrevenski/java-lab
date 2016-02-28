package com.thread.basic;

public class BasicThread {

	public static void main(String[] args) {
		
		new Runnable() {
			public void run() {
				System.out.println("Thread 1");
			}
		}.run();

		
		Thread thr = new Thread(new SampleThread());
		thr.start();
	}
	
	
}

class SampleThread implements Runnable {

	@Override
	public void run() {
		System.out.println("running a thread");
	}
	
}