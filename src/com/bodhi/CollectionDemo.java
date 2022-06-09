package com.bodhi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		List values = new ArrayList();
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(2, "2");
		
		for(Object o: values) {
			System.out.println(o);
		}
	}
}
