package com.bodhi;

class Counter {
	int i;
	int j;
	
	// this is not thread safe. 
	// if multiple threads are calling increment method then the expected result may not achieved.
	public void increment() {
		i++;
	}
	
	// this is thread safe. since only one thread is accessing the data at a time.
	public synchronized void syncIncrement() {
		j++;
	}
}

public class SyncDemo {
	public static void main(String[] args) throws Exception {
		Counter counter = new Counter();
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; ++i)
				counter.increment();
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; ++i)
				counter.increment();
		});
		
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 1000; ++i)
				counter.syncIncrement();
		});
		
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 1000; ++i)
				counter.syncIncrement();
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();

		System.out.println(counter.i);
		System.out.println(counter.j);
	}
}
