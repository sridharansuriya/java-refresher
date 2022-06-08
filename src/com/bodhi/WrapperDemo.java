package com.bodhi;
public class WrapperDemo {
	public static void main(String[] args) {
		int i = 5;
		Integer ii = new Integer(i); // Boxing/Wrapping
		int j = ii.intValue(); // Unboxing/unwrapping
		
		Integer k = i; // Autoboxing
		int l = k; // Autounboxing/Autounwrapping
	}
}
