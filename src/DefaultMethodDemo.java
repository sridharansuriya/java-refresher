interface Demo {
	void abc();
	default void show() {
		System.out.println("in show");
	}
}

class DemoImpl implements Demo {
	@Override
	public void abc() {
		System.out.println("in abc");
	}
}

public class DefaultMethodDemo {
	public static void main(String[] args) {
		Demo obj = new DemoImpl();
		obj.abc();
		obj.show();
	}
}
