package com.bodhi;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; ++i) {
				System.out.println("Hi");
				try {	Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; ++i) {
				System.out.println("Hello");
				try {	Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			}
		});
		t1.start();
		// introducing a minor delay to maintain sequence.
		try {	Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Bye");
	}
}
