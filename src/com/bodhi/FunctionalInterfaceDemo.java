package com.bodhi;
@FunctionalInterface  //This is not needed. But with this the compiler will check the interface has one and only one method
interface Functional {
	void show();
}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		Functional obj = () -> System.out.println("Hi there"); // this is the definition for show method
		obj.show();
	}
}
