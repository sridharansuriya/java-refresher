package com.bodhi;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(7);
		
		values.stream().forEach(System.out::println);
	}
}
