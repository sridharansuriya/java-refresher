package com.bodhi;
interface Abc {
	void show();
}

public class AnonymousClassDemo {
	public static void main(String[] args) {
		Abc obj = new Abc() {
			@Override
			public void show() {
				System.out.println("in show");
			}		
		};
		
		obj.show();
	}
}
