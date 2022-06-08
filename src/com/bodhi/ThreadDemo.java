package com.bodhi;

class Hi implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; ++i) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; ++i) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		Runnable hi = new Hi();
		Runnable hello = new Hello();
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(hello);
		t1.start();
		// introducing a minor delay to maintain sequence.
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}
