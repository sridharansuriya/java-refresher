package com.bodhi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud> {
	private int rollno;
	private String name;
	private int marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Stud(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Stud o) {
		// TODO Auto-generated method stub
		return marks > o.marks ? 1 : -1;
	}
}

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

		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23, "Suriya", 70));
		studs.add(new Stud(24, "Srinidhi", 80));
		studs.add(new Stud(25, "Madhavan", 60));

		Collections.sort(studs);

		System.out.println();
		System.out.println();
		for (Stud s : studs) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println();

		// Sorting using comparator which takes precedence over comparable.
		Collections.sort(studs, (i, j) -> i.getName().length() > j.getName().length() ? 1 : -1);
		for (Stud s : studs) {
			System.out.println(s);
		}

	}
}
