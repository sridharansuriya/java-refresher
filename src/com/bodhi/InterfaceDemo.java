package com.bodhi;
interface WriterInterface {
	void write();
}

class Sketch implements WriterInterface {
	@Override
	public void write() {
		System.out.println("I am a sketch pen");
	}
}

class Crayon implements WriterInterface {
	@Override
	public void write() {
		System.out.println("I am a crayon");
	}
}

class Kit {
	public void doSomething(WriterInterface w) {
		w.write();
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Kit k = new Kit();
		WriterInterface s = new Sketch();
		k.doSomething(s);
		WriterInterface c = new Crayon();
		k.doSomething(c);
	}
}
