package com.bodhi;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		int i = 8;
		int j = 9;
		int k = i / j;
		if (k == 0) {
			try {
				throw new BodhiException("divisor cannot be greater than dividend");
			} catch (BodhiException e) {
				System.out.println("Error occurred: " + e.getMessage());
			}
		}
	}

}
