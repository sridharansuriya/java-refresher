package com.bodhi;
interface Static {
	static void abc() {
		System.out.println("In abc");
	}
}

public class StaticMethodDemo {
	public static void main(String[] args) {
		Static.abc();
	}
}
