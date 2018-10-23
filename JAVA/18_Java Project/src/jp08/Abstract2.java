package jp08;

abstract class Parent22 {
	public static final double PI = 3.141592;

	public abstract void method1();
	public abstract void method2();
}

class ChildOne22 extends Parent22 {
	@Override
	public void method1() {
		System.out.println("ChildOne method1()");
	}
	@Override
	public void method2() {
		System.out.println("ChildOne method2()");
	}
}

class ChildTwo22 extends Parent22 {
	@Override
	public void method1() {
		System.out.println("ChildTwo method1()");
	}
	@Override
	public void method2() {
		System.out.println("ChildTwo method2()");
	}
}

public class Abstract2 {
	static void doSomething(Parent22 parent) {
		parent.method1();
		parent.method2();
	}

	public static void main(String[] args) {
		ChildOne22 obj1 = new ChildOne22();
		ChildTwo22 obj2 = new ChildTwo22();
		doSomething(obj1);
		doSomething(obj2);
	}
}
