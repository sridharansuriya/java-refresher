package com.bodhi;
abstract class Writer {
	public void write(String input) {
		System.out.println("Writing text: " + input);
	}
}

class Pen extends Writer {
	
}

class Pencil extends Writer {
	
}

public class AbstractDemo {
	public static void main(String[] args) {
		Writer w = new Pen();
		w.write("Pen text");
		w = new Pencil();
		w.write("Pencil text");
	}
}
