package com.bodhi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>(); // Usage of generics
		values.add(404);
		values.add(639);
		values.add(908);
		values.add(265);

		Collections.sort(values);

		for (Integer o : values) {
			System.out.println(o);
		}
		
		System.out.println();
		System.out.println();

		// Using comparator interface
		// This sorts based on last digit
		// Not we are using lambda expression here to implement comparator interface
		Collections.sort(values, (i, j) -> i % 10 > j % 10 ? 1 : -1);
		
		for (Integer o : values) {
			System.out.println(o);
		}
		
	}
}
