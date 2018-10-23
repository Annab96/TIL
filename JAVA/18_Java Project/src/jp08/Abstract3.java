package jp08;

abstract class Parent33 {
	public static final double PI = 3.141592;

	public abstract void method1();
	public abstract void method2();
}

abstract class Child extends Parent33 {
	@Override
	public void method1() {
		System.out.println("Child method1()");
	}
}

class GrandChild extends Child {
	@Override
	public void method2() {
		System.out.println("GrandChild method2()");
	}
}

public class Abstract3 {
	static void doSomething(Parent33 parent) {
		parent.method1();
		parent.method2();
	}
	public static void main(String[] args) {
		doSomething(new GrandChild());
	}
}
