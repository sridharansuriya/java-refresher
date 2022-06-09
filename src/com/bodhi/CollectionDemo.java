package com.bodhi;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();  // Usage of generics
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(2, 2);
		
		for(Integer o: values) {
			System.out.println(o);
		}
	}
}
