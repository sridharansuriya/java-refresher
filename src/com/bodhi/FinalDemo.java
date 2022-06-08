package com.bodhi;
class A {
	public final int DAY=0; 
	public final int WEEK;
	public A() {
		// DAY=1; will fail since final variable cannot be modified. Usually used for constants
		this.WEEK = 1; // This is supported since we can initialize final values in constructor		
	}
	
	public final void show() {
		System.out.println("in A show");
	}
}

class B extends A {
	/* will not work since show method is final in Base class
	 * public void show() { System.out.println("in B show"); }
	 */
}

final class C {
	
}

/* Again will not work since class C is final
 * class D extends C {
 * 
 * }
 */

public class FinalDemo {
	public static void main(String[] args) {
	}
}
