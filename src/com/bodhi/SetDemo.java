package com.bodhi;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(34);
		set1.add(97);
		set1.add(63);
		set1.add(82);
		set1.add(63); // will not get added since all the elements in a set are unique.
		
		for (int i: set1) {
			System.out.println(i); // order will not be maintained.
		}
		
		System.out.println();
		System.out.println();
		
		set1 = new TreeSet<>();
		
		set1.add(34);
		set1.add(97);
		set1.add(63);
		set1.add(82);
		
		for (int i: set1) {
			System.out.println(i); // will be sorted
		}
	}
}
