package com.bodhi;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println(9 / 0);
		} finally {
			System.out.println("Bye"); // This will get printed since exceptions is handled.
		}
	}
}
